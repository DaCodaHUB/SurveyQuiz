package com.example.lewin.surveyquiz.Fragments.StartFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;

import com.example.lewin.surveyquiz.Fragments.BaseFragment;
import com.example.lewin.surveyquiz.Fragments.FragmentListener;
import com.example.lewin.surveyquiz.R;

import javax.inject.Inject;

import butterknife.OnClick;


public class StartFragment extends BaseFragment {
    @Inject
    FragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    /*
    @OnClick(R.id.example_1)
    void onExample1Clicked() {
        listener.onExample1Clicked();
    }
    */

}
