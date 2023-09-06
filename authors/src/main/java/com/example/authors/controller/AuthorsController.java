package com.example.authors.controller;

import com.example.authors.entity.Authors;
import com.example.authors.entity.FullAuthorsResponse;
import com.example.authors.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/authors")
@RequiredArgsConstructor
@RestController
public class AuthorsController {

    private final AuthorService authorService;


    @PostMapping()
    public ResponseEntity<Authors> create(@RequestBody Authors authors)  {
        return ResponseEntity.ok(authorService.addAuthor(authors).getBody());
    }

    @GetMapping()
    public ResponseEntity<List<Authors>> getAll() {
        return  ResponseEntity.ok(authorService.findAuthors().getBody());

    }
    @GetMapping("/with-books/{author-id}")
    public ResponseEntity<FullAuthorsResponse> findAllAuthors(@PathVariable( "author-id") Integer authorId){
        return ResponseEntity.ok(authorService.findAuthorsWithBooks(authorId));
    }

}
