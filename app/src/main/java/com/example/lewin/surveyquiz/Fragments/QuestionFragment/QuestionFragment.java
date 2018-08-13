package com.example.lewin.surveyquiz.Fragments.QuestionFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.lewin.surveyquiz.Fragments.BaseViewFragment;
import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.Fragments.QuestionFragment.Presenter.QuestionPresenter;
import com.example.lewin.surveyquiz.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class QuestionFragment extends BaseViewFragment<QuestionPresenter>
        implements QuestionView  {

    /*
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
    */

    @Inject
    FragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_question, container, false);
    }

    @Override
    public void showQuestion() {
        // Todo: Set Texts
    }

    @OnClick(R.id.answerA)
    void onAnsAClicked() {
        listener.onAnsAClicked();
    }

    @OnClick(R.id.answerB)
    void onAnsBClicked() {
        listener.onAnsBClicked();
    }

    @OnClick(R.id.answerC)
    void onAnsCClicked() {
        listener.onAnsCClicked();
    }

    @OnClick(R.id.answerD)
    void onAnsDClicked() {
        listener.onAnsDClicked();
    }

}
