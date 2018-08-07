package com.example.lewin.surveyquiz;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules= AppModule.class)
interface AppComponent extends AndroidInjector<SurveyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<SurveyApplication> {

    }
}
