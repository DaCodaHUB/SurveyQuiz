package com.example.lewin.surveyquiz.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private FragmentActivity mActivity;

    public ActivityModule(FragmentActivity activity) {
        mActivity = activity;
    }

    @Provides
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Singleton
    @Provides
    FragmentManager provideFramentManager() {
        return mActivity.getSupportFragmentManager();
    }

    @Singleton
    @Provides
    FragmentTransaction provideFragmentTransaction(FragmentManager manager) {
        return manager.beginTransaction();
    }
}

