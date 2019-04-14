package com.example.i702839.daggerdemos.model;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Shashi on 4/13/19.
 */

public class Car {

    private static final String TAG = "Car";

    Wheel wheel;
    @Inject Engine engine;
    @Inject WheelsInsideAnotherLibrary wheelsInsideAnotherLibrary;

    @Inject
    public Car(Wheel wheel) {
        this.wheel = wheel;
    }


    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "Driving started...");
    }
}
