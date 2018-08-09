package com.example.lewin.surveyquiz.Fragments.ResultFragment;

import com.example.lewin.surveyquiz.Fragments.BaseFragmentModule;
import com.example.lewin.surveyquiz.Fragments.ResultFragment.Presenter.ResultPresenterModule;
import com.example.lewin.surveyquiz.di.PerFragment;

import android.app.Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = {
        BaseFragmentModule.class,
        ResultPresenterModule.class
})
public abstract class ResultFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(ResultFragment example1Fragment);

    @Binds
    @PerFragment
    abstract ResultView resultView(ResultFragment resultFragment);
}

