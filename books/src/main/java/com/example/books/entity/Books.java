package com.example.books.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "book")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private  int authorId;

}
