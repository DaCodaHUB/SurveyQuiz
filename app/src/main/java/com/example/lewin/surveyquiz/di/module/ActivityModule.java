package com.example.lewin.surveyquiz.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.lewin.surveyquiz.MainActivity;
import com.example.lewin.surveyquiz.di.ActivityContext;

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
    @ActivityContext
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

