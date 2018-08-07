package com.example.lewin.surveyquiz.di.components;

import com.example.lewin.surveyquiz.di.module.ActivityModule;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}

