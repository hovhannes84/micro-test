package com.example.authors.service;

import com.example.authors.client.BooksClient;
import com.example.authors.entity.Authors;
import com.example.authors.entity.FullAuthorsResponse;
import com.example.authors.repository.AuthorRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Builder
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final BooksClient client;


    public ResponseEntity<Authors> addAuthor(Authors authors){
        return ResponseEntity.ok(authorRepository.save(authors));
    }

    public ResponseEntity<List<Authors>> findAuthors() {
        List<Authors> all = authorRepository.findAll();
        return ResponseEntity.ok(all);
    }

    public FullAuthorsResponse findAuthorsWithBooks(Integer authorId) {
        var authors = authorRepository.findById(authorId)
                .orElse(Authors.builder()
                        .name("NOT-FOUND")
                        .build());
        var booksList = client.findAllBooksByAuthor(authorId);
        return FullAuthorsResponse.builder()
                .name(authors.getName())
                .books(booksList)
                .build();

    }
}
