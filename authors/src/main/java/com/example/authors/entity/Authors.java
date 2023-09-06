package com.example.authors.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Entity
@Table(name = "author")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

}
