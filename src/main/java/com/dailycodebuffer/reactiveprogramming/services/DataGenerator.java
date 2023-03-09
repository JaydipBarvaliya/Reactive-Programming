package com.dailycodebuffer.reactiveprogramming.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Function;

public class DataGenerator {
    public Flux<String> fruitsFlux() {
        return Flux.fromIterable(List.of("KIWI", "Mango", "Orange", "Banana")).map(String::toUpperCase);
    }

    public Mono<String> fruitsMono(){
        return Mono.just("Mango");
    }


    public static Flux<String> customTransform(Flux<String> foodData){


        Flux<String> filteredVeg = FoodUtilities.vegTransform(foodData);

        Flux<String> filteredFruit = FoodUtilities.fruitTransform(foodData);

//        return transformationData.transform();
        return null;
    }
}