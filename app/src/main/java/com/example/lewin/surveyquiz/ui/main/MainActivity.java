package com.example.lewin.surveyquiz.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.Fragments.QuestionFragment.QuestionFragment;
import com.example.lewin.surveyquiz.Fragments.ResultFragment.ResultFragment;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;
import com.example.lewin.surveyquiz.R;
import com.example.lewin.surveyquiz.ui.common.BaseActivity;

public final class MainActivity extends BaseActivity implements FragmentListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            addFragment(R.id.frame, new StartFragment(),"Start");
        }
    }

    @Override
    public void onStartClicked() {
        replaceFragment(R.id.frame, new QuestionFragment(), "Question");
    }

    @Override
    public void onAnsAClicked() {
        replaceFragment(R.id.frame, new ResultFragment(), "Result");
    }

}

