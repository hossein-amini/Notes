package com.aminiam.notes.activity;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity{
    private static final String TAG = BaseActivity.class.getSimpleName();

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onCreate");
    }
}
