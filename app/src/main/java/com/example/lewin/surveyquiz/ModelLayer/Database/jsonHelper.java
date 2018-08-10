package com.example.lewin.surveyquiz.ModelLayer.Database;

import com.example.lewin.surveyquiz.Helpers.Question;
import com.example.lewin.surveyquiz.di.PerActivity;

import java.util.ArrayList;

import javax.inject.Inject;

@PerActivity
public class jsonHelper {

    ArrayList<Question> questionList;

    @Inject
    public jsonHelper() {
    }
}
