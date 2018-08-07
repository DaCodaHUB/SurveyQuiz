package com.example.lewin.surveyquiz;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;

//import com.mindorks.example.android_dagger2_example.data.DataManager;
import com.example.lewin.surveyquiz.di.components.DaggerApplicationComponent;
import com.example.lewin.surveyquiz.di.components.ApplicationComponent;
import com.example.lewin.surveyquiz.di.module.ApplicationModule;


import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;


public class SurveyApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder().build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}

