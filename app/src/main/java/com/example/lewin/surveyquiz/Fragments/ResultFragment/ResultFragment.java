package com.example.lewin.surveyquiz.Fragments.ResultFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lewin.surveyquiz.Fragments.BaseViewFragment;
import com.example.lewin.surveyquiz.Fragments.ResultFragment.Presenter.ResultPresenter;
import com.example.lewin.surveyquiz.R;

import butterknife.BindView;

public final class ResultFragment extends BaseViewFragment<ResultPresenter>
        implements ResultView {

    @BindView(R.id.result)
    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void showResult(String result) {

    }
}
