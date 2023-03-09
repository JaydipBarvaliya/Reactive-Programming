package com.dailycodebuffer.reactiveprogramming.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

class FluxAndMonoServicesTest {



    FluxAndMonoServices fluxAndMonoServices = new FluxAndMonoServices();
    @Test
    void fruitsFlux() {

        Flux<String> stringFlux = fluxAndMonoServices.fruitsFlux();

        StepVerifier.create(stringFlux).expectNext("MANGO", "ORANGE", "BANANA").verifyComplete();
    }

    @Test
    void fruitsMono() {
    }
}