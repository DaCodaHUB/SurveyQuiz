package com.example.lewin.surveyquiz.Fragments.ResultFragment.Presenter;

import com.example.lewin.surveyquiz.Fragments.ResultFragment.ResultView;
import com.example.lewin.surveyquiz.di.PerFragment;
import com.example.lewin.surveyquiz.ui.common.Presenter.BasePresenter;
import com.example.lewin.surveyquiz.ui.common.Presenter.Presenter;

import javax.inject.Inject;
import javax.xml.transform.Result;

@PerFragment
final class ResultPresenterImpl extends BasePresenter<ResultView> implements ResultPresenter {

    @Inject
    ResultPresenterImpl(ResultView view) {
        super(view);
    }

    @Override
    public void onDoSomething() {

    }
}

