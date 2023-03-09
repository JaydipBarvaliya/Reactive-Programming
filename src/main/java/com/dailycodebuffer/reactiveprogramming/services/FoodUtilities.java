package com.dailycodebuffer.reactiveprogramming.services;

import reactor.core.publisher.Flux;

import java.util.function.Function;

public interface FoodUtilities {

    public static Flux<String> fruitTransform(Flux<String> fruitToBeTransform) {
        return fruitToBeTransform.filter(fruit -> fruit.length() > 4);
    }

    public static Flux<String> vegTransform(Flux<String> vegToBeTransform) {
        return vegToBeTransform.filter(veg -> veg.length()>10).filter(vegLenFilter -> vegLenFilter.startsWith("FRESH"));
    }


}
