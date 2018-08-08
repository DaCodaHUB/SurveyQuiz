package com.example.lewin.surveyquiz.ui.main;

import android.app.Activity;

import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragmentModule;
import com.example.lewin.surveyquiz.di.PerActivity;
import com.example.lewin.surveyquiz.di.PerFragment;
import com.example.lewin.surveyquiz.ui.common.BaseActivityModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = StartFragmentModule.class)
    abstract StartFragment mainFragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);

    @Binds
    @PerActivity
    abstract FragmentListener mainFragmentListener(MainActivity mainActivity);

}
