package com.dailycodebuffer.reactiveprogramming.ServicesOfBooks;

import com.dailycodebuffer.reactiveprogramming.domain.BookInfo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class BookInfoService {

    public Flux<BookInfo> getBooks(){
        var Books= List.of(new BookInfo(1,"book1","author one","121212"),
                new BookInfo(2,"book2","author two","343434"),
                new BookInfo(3,"book3","author three","565656")
        );
        return Flux.fromIterable(Books);
    }

    public Mono<BookInfo> getBookById(long bookId){
        var book=new BookInfo(bookId,"book1","author one","121212");
        return Mono.just(book);
    }
}
