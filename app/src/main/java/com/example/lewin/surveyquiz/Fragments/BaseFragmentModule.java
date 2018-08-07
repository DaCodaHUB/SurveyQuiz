package com.example.lewin.surveyquiz.Fragments;

import com.example.lewin.surveyquiz.di.PerFragment;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

import android.app.Fragment;
import android.app.FragmentManager;

@Module
public abstract class BaseFragmentModule {

    public static final String FRAGMENT = "BaseFragmentModule.fragment";

    static final String CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager";

    @Provides
    @Named(CHILD_FRAGMENT_MANAGER)
    @PerFragment
    static FragmentManager childFragmentManager(@Named(FRAGMENT) Fragment fragment) {
        return fragment.getChildFragmentManager();
    }
}
