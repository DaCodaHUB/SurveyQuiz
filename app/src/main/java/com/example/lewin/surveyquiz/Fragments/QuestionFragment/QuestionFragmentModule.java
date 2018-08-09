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

    /**
     * As per the contract specified in {@link BaseFragmentModule}; "This must be included in all
     * fragment modules, which must provide a concrete implementation of {@link Fragment}
     * and named {@link BaseFragmentModule#FRAGMENT}.
     *
     * @param example1Fragment the example 1 fragment
     * @return the fragment
     */
    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(QuestionFragment example1Fragment);

    @Binds
    @PerFragment
    abstract QuestionView example1View(QuestionFragment example1Fragment);
}

