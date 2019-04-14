package com.example.i702839.daggerdemos.model;

import android.util.Log;

/**
 * Created by i702839 on 4/14/19.
 */

public class WheelsInsideAnotherLibrary {

    // this class is not in our control

    private static final String TAG = "Car";

    private Rims rims;
    private Tires tires;

    public WheelsInsideAnotherLibrary(Rims rims, Tires tires) {
        Log.d(TAG, "WheelsInsideAnotherLibrary: Inside WheelsInsideAnotherLibrary");
        this.rims = rims;
        this.tires = tires;
    }
}
