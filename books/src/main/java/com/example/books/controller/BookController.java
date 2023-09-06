package com.example.books.controller;

import com.example.books.entity.Books;
import com.example.books.service.BooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/books")
@RequiredArgsConstructor
@RestController
public class BookController {

    private final BooksService booksService;


    @PostMapping()
    public ResponseEntity<Books> create(@RequestBody Books books)  {
        return ResponseEntity.ok(booksService.addBook(books).getBody());
    }

    @GetMapping()
    public ResponseEntity<List<Books>> getAll() {
        return  ResponseEntity.ok(booksService.findBooks().getBody());

    }
    @GetMapping("/book/{author-id}")
    public ResponseEntity<List<Books>> findAllStudents(@PathVariable("author-id")Integer authorId){
        return ResponseEntity.ok(booksService.findAllBooksByAuthor(authorId));
    }

}
