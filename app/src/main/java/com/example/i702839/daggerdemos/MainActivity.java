package com.example.i702839.daggerdemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.i702839.daggerdemos.di.CarComponent;
import com.example.i702839.daggerdemos.di.DaggerCarComponent;
import com.example.i702839.daggerdemos.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car; // Field injection

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        //car = carComponent.getCar();
        carComponent.inject(this);
        car.drive();
    }
}
