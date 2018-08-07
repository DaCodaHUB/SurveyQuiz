package com.example.lewin.surveyquiz.ui.main;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;
import com.example.lewin.surveyquiz.R;
import com.example.lewin.surveyquiz.SurveyApplication;
import com.example.lewin.surveyquiz.di.components.ActivityComponent;
import com.example.lewin.surveyquiz.di.components.DaggerActivityComponent;
import com.example.lewin.surveyquiz.di.module.ActivityModule;

public class MainActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;
    private FragmentTransaction fragmentTransaction;

    public ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(SurveyApplication.get(this).getComponent())
                    .build();
        }
        return activityComponent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        // Set up Fragment manager and fragment transaction
        //FragmentManager frag_manager = getSupportFragmentManager();
        //FragmentTransaction frag_transaction = frag_manager.beginTransaction();

        // Put the third fragment to the screen
        fragmentTransaction.replace(R.id.frame, new StartFragment());
        fragmentTransaction.commit();

    }
}
