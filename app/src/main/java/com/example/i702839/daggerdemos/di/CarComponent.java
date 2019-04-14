package com.example.i702839.daggerdemos.di;

import com.example.i702839.daggerdemos.MainActivity;
import com.example.i702839.daggerdemos.model.Car;
import com.example.i702839.daggerdemos.modules.WheelsInsideAnotherLibraryModule;

import dagger.Component;

/**
 * Created by i702839 on 4/13/19.
 */

@Component(modules = WheelsInsideAnotherLibraryModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
