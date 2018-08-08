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
}
