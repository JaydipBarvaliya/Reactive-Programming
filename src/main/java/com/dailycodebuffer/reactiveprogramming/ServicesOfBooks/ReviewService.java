package com.dailycodebuffer.reactiveprogramming.ServicesOfBooks;

import com.dailycodebuffer.reactiveprogramming.domain.Review;
import reactor.core.publisher.Flux;

import java.util.List;

public class ReviewService {

    public Flux<Review> getReview(long bookId){
        var reviewList= List.of(
                new Review(1,bookId,9.1,"GoodBook"),
                new Review(2,bookId,8.6,"worth reading")
                );
        return Flux.fromIterable(reviewList);
    }
}
