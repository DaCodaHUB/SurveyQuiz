package com.example.lewin.surveyquiz.Fragments.QuestionFragment.Presenter;

import com.example.lewin.surveyquiz.di.PerFragment;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class QuestionPresenterModule {

    @Binds
    @PerFragment
    abstract QuestionPresenter questionPresenter(QuestionPresenterImpl example1PresenterImpl);
}

