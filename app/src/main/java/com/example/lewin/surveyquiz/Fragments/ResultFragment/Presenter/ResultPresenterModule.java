package com.example.lewin.surveyquiz.Fragments.ResultFragment.Presenter;

import com.example.lewin.surveyquiz.di.PerFragment;
import com.example.lewin.surveyquiz.ui.common.Presenter.Presenter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ResultPresenterModule {

    @Binds
    @PerFragment
    abstract ResultPresenter resultPresenter(ResultPresenterImpl resultPresenterImpl);
}

