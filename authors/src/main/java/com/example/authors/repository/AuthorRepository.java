package com.example.authors.repository;

import com.example.authors.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Authors,Integer> {

}
