package com.example.lewin.surveyquiz.ui.main;

import android.app.Activity;

import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.Fragments.QuestionFragment.QuestionFragment;
import com.example.lewin.surveyquiz.Fragments.QuestionFragment.QuestionFragmentModule;
import com.example.lewin.surveyquiz.Fragments.ResultFragment.ResultFragment;
import com.example.lewin.surveyquiz.Fragments.ResultFragment.ResultFragmentModule;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragmentModule;
import com.example.lewin.surveyquiz.di.PerActivity;
import com.example.lewin.surveyquiz.di.PerFragment;
import com.example.lewin.surveyquiz.ui.common.BaseActivityModule;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = StartFragmentModule.class)
    abstract StartFragment startFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector(modules = QuestionFragmentModule.class)
    abstract QuestionFragment questionFragmentInjector();

    @PerFragment
    @ContributesAndroidInjector(modules = ResultFragmentModule.class)
    abstract ResultFragment resultFragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);

    @Binds
    @PerActivity
    abstract FragmentListener mainFragmentListener(MainActivity mainActivity);

}
