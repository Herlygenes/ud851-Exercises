package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    // TODO (6) Create a TextView field to display your message
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        // TODO (7) Get a reference to your TextView in Java
        mDisplayText = (TextView) findViewById(R.id.tv_display);
    }
}
