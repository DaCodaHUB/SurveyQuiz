package com.example.lewin.surveyquiz.di.components;

import android.app.Application;
import android.content.Context;

import com.example.lewin.surveyquiz.SurveyApplication;
//import com.example.lewin.surveyquiz.data.DataManager;
//import com.example.lewin.surveyquiz.data.DbHelper;
//import com.example.lewin.surveyquiz.data.SharedPrefsHelper;
import com.example.lewin.surveyquiz.di.ApplicationContext;
import com.example.lewin.surveyquiz.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SurveyApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

}

