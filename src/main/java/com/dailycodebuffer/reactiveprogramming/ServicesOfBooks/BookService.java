package com.dailycodebuffer.reactiveprogramming.ServicesOfBooks;

import com.dailycodebuffer.reactiveprogramming.domain.Book;
import com.dailycodebuffer.reactiveprogramming.domain.Review;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class BookService {
    private BookInfoService bookInfoService;
    private ReviewService reviewService;

    public BookService(BookInfoService bookInfoService, ReviewService reviewService) {
        this.bookInfoService = bookInfoService;
        this.reviewService = reviewService;
    }

    public Flux<Book> getBooks(){
        var allBooks = bookInfoService.getBooks();
        return allBooks
                .flatMap(bookInfo -> {
                    Mono<List<Review>> reviews =
                            reviewService.getReview(bookInfo.getBookId()).collectList();
                    return reviews
                            .map(review -> new Book(bookInfo, review));
                }).log();
    }
}

