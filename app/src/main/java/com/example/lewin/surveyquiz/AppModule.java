package com.example.lewin.surveyquiz;

import android.app.Application;

import com.example.lewin.surveyquiz.di.PerActivity;
import com.example.lewin.surveyquiz.ui.main.MainActivity;
import com.example.lewin.surveyquiz.ui.main.MainActivityModule;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract Application application(SurveyApplication app);

    /**
     * Provides the injector for the {@link MainActivity}, which has access to the dependencies
     * provided by this application instance (singleton scoped objects).
     */
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}

