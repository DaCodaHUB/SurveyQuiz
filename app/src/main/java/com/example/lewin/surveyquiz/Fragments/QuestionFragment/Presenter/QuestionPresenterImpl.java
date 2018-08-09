package com.example.lewin.surveyquiz.Fragments.QuestionFragment.Presenter;

import com.example.lewin.surveyquiz.Fragments.QuestionFragment.QuestionView;
import com.example.lewin.surveyquiz.di.PerFragment;
import com.example.lewin.surveyquiz.ui.common.Presenter.BasePresenter;

import javax.inject.Inject;

@PerFragment
final class QuestionPresenterImpl extends BasePresenter<QuestionView> implements QuestionPresenter {

    @Inject
    QuestionPresenterImpl(QuestionView view) {
        super(view);
    }

    @Override
    public void onDoSomething() {

    }
}

