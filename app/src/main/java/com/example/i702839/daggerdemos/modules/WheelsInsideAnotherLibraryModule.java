package com.example.i702839.daggerdemos.modules;

import com.example.i702839.daggerdemos.model.Rims;
import com.example.i702839.daggerdemos.model.Tires;
import com.example.i702839.daggerdemos.model.WheelsInsideAnotherLibrary;

import dagger.Module;
import dagger.Provides;

/**
 * Created by i702839 on 4/14/19.
 */

@Module
public class WheelsInsideAnotherLibraryModule {

    // we can make the method static as they are not holding any non-static member's instance

    @Provides
    Rims provideRims() {
        return new Rims();
    }

    @Provides
    Tires provideTires() {
        return new Tires();
    }

    @Provides
    WheelsInsideAnotherLibrary provideWheelsFromAnotherLibrary(Rims rims, Tires tires) {
        return new WheelsInsideAnotherLibrary(rims, tires);
    }
}
