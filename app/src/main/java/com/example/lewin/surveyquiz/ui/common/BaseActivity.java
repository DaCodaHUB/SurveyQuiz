package com.example.lewin.surveyquiz.ui.common;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;
import android.app.FragmentTransaction;

import com.example.lewin.surveyquiz.Navigator.Navigator;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

public abstract class BaseActivity extends Activity implements HasFragmentInjector {

    @Inject
    protected Navigator navigator;

    @Inject
    @Named(BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER)
    FragmentManager fragmentManager;

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public final AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }

    protected final void addFragment(@IdRes int containerViewId, Fragment fragment) {
        fragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit();
    }

    protected final void replaceFragment(@IdRes int containerViewId, Fragment fragment) {
        fragmentManager.beginTransaction()
                .replace(containerViewId, fragment)
                .addToBackStack(null)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }

    protected final void showDialogFragment(DialogFragment dialogFragment, String tag) {
        dialogFragment.show(fragmentManager, tag);
    }
}

