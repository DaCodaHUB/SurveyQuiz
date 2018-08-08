package com.example.lewin.surveyquiz.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;
import com.example.lewin.surveyquiz.R;
import com.example.lewin.surveyquiz.ui.common.BaseActivity;

public final class MainActivity extends BaseActivity implements FragmentListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            addFragment(R.id.frame, new StartFragment());
        }
    }


    @Override
    public void onStartClicked() {
        navigator.toQuestion();
    }

}

