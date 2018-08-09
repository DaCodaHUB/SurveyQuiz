package com.example.lewin.surveyquiz.Fragments.QuestionFragment;

import com.example.lewin.surveyquiz.Fragments.BaseFragmentModule;
import com.example.lewin.surveyquiz.Fragments.QuestionFragment.Presenter.QuestionPresenterModule;
import com.example.lewin.surveyquiz.di.PerFragment;

import android.app.Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = {
        BaseFragmentModule.class,
        QuestionPresenterModule.class
})
public abstract class QuestionFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(QuestionFragment questionFragment);

    @Binds
    @PerFragment
    abstract QuestionView questionView(QuestionFragment questionFragment);
}

