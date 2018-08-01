package com.example.lewin.surveyquiz;

import android.app.Application;
import android.content.Context;

//import com.mindorks.example.android_dagger2_example.data.DataManager;
import com.example.lewin.surveyquiz.di.components.DaggerApplicationComponent;
import com.example.lewin.surveyquiz.di.components.ApplicationComponent;
import com.example.lewin.surveyquiz.di.module.ApplicationModule;

import javax.inject.Inject;


public class SurveyApplication extends Application {

    protected ApplicationComponent applicationComponent;

    public static SurveyApplication get(Context context) {
        return (SurveyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}

