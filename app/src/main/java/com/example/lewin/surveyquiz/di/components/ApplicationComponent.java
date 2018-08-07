package com.example.lewin.surveyquiz.di.components;

import android.app.Application;
import android.content.Context;

import com.example.lewin.surveyquiz.Fragments.QuestionFragment.QuestionFragment;
import com.example.lewin.surveyquiz.Fragments.ResultFragment.ResultFragment;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;
import com.example.lewin.surveyquiz.SurveyApplication;
//import com.example.lewin.surveyquiz.data.DataManager;
//import com.example.lewin.surveyquiz.data.DbHelper;
//import com.example.lewin.surveyquiz.data.SharedPrefsHelper;
import com.example.lewin.surveyquiz.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SurveyApplication surveyApplication);
    void inject(StartFragment startFragment);
    void inject(QuestionFragment questionFragment);
    void inject(ResultFragment resultFragment);

    Context getContext();

    Application getApplication();

}

