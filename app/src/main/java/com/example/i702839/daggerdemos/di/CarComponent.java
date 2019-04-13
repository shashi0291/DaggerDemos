package com.example.i702839.daggerdemos.di;

import com.example.i702839.daggerdemos.model.Car;

import dagger.Component;

/**
 * Created by i702839 on 4/13/19.
 */

@Component
public interface CarComponent {

    Car getCar();
}
