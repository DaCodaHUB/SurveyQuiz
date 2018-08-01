package com.example.lewin.surveyquiz;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

//import com.mindorks.example.android_dagger2_example.data.DataManager;
//import com.mindorks.example.android_dagger2_example.data.model.User;
import com.example.lewin.surveyquiz.di.components.ActivityComponent;
import com.example.lewin.surveyquiz.di.components.DaggerActivityComponent;
import com.example.lewin.surveyquiz.di.module.ActivityModule;

import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;

import javax.inject.Inject;

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
