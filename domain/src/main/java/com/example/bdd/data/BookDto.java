package com.example.bdd.data;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {

    private Long id;

    private String title;

    private String description;

    private Double price;
}
