package com.example.books.repository;

import com.example.books.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Books,Integer> {
    List<Books> findAllByAuthorId(Integer authorId);
}

