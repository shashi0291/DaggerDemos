package com.example.i702839.daggerdemos.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by i702839 on 4/13/19.
 */

public class Engine {

    private static final String TAG = "Car";

    @Inject
    public Engine() {
        Log.d(TAG, "Engine: Inside engine");
    }
}
