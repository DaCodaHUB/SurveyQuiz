package com.example.lewin.surveyquiz;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import com.example.lewin.surveyquiz.Fragments.StartFragment.StartFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up Fragment manager and fragment transaction
        FragmentManager frag_manager = getSupportFragmentManager();
        FragmentTransaction frag_transaction = frag_manager.beginTransaction();

        // Put the third fragment to the screen
        frag_transaction.replace(R.id.frame, new StartFragment());
        frag_transaction.commit();

    }
}
