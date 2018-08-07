package com.example.lewin.surveyquiz.Fragments.StartFragment;

import com.example.lewin.surveyquiz.Fragments.BaseFragmentModule;
import com.example.lewin.surveyquiz.di.PerFragment;

import android.app.Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = BaseFragmentModule.class)
public abstract class StartFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(StartFragment mainFragment);
}

