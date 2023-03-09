package com.dailycodebuffer.reactiveprogramming.services;

import static com.dailycodebuffer.reactiveprogramming.services.DataGenerator.customTransform;

public class FluxAndMonoServices {

    private static final DataGenerator dataGenerator = new DataGenerator();
    public static void main(String[] args) {
        customTransform(dataGenerator.fruitsFlux()).subscribe(System.out::println);
    }
}
