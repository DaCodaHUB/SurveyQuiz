package com.example.lewin.surveyquiz.di.components;

import com.example.lewin.surveyquiz.MainActivity;
import com.example.lewin.surveyquiz.di.PerActivity;
import com.example.lewin.surveyquiz.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}

