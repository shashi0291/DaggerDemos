package com.example.i702839.daggerdemos.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by i702839 on 4/13/19.
 */

public class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote () {
        Log.d(TAG, "Remote: Inside remote");
    }

    public void setListener(Car car) {
        Log.d(TAG, "setListenet: Set");
    }
}
