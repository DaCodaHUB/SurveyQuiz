package com.example.lewin.surveyquiz.ui.common.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.lewin.surveyquiz.ui.common.MVPView;

public abstract class BasePresenter<T extends MVPView> implements Presenter {

    protected final T view;

    protected BasePresenter(T view) {
        this.view = view;
    }

    @Override
    public void onStart(@Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

    @Override
    public void onEnd() {
    }
}

