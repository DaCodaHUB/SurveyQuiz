package com.example.lewin.surveyquiz.Fragments.QuestionFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lewin.surveyquiz.Fragments.BaseFragment;
import com.example.lewin.surveyquiz.Fragments.BaseViewFragment;
import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.Fragments.QuestionFragment.Presenter.QuestionPresenter;
import com.example.lewin.surveyquiz.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class QuestionFragment extends BaseViewFragment<QuestionPresenter>
        implements QuestionView  {

    @BindView(R.id.question)
    TextView question;

    @BindView(R.id.answerA)
    Button answerA;

    @BindView(R.id.answerB)
    Button answerB;

    @BindView(R.id.answerC)
    Button answerC;

    @BindView(R.id.answerD)
    Button answerD;

    @Inject
    FragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @OnClick(R.id.answerA)
    void onAnsAClicked() {
        listener.onStartClicked();
    }
}
