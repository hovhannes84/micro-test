package com.example.authors.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullAuthorsResponse {

    private String name;

    List<Books> books;



}
