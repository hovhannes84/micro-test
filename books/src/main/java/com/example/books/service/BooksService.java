package com.example.books.service;

import com.example.books.entity.Books;
import com.example.books.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BooksService {

    private final BookRepository bookRepository;


    public ResponseEntity<Books> addBook(Books books){
        bookRepository.save(books);
        return ResponseEntity.ok(books);
    }

    public ResponseEntity<List<Books>> findBooks() {
        List<Books> all = bookRepository.findAll();
        return ResponseEntity.ok(all);
    }

    public List<Books> findAllBooksByAuthor(Integer authorId) {
        return bookRepository.findAllByAuthorId(authorId);
    }
}
