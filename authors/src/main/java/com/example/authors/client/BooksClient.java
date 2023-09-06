package com.example.authors.client;

import com.example.authors.entity.Books;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "books-service", url = "${application.config.books-url}")
public interface BooksClient {

    @GetMapping("/book/{author-id}")
    List<Books> findAllBooksByAuthor(@PathVariable("author-id") Integer authorId);


}
