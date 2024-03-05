package org.example;

import lombok.*;

import java.io.Serializable;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book implements Serializable{
    private String isbn,titulo,autor,año_publicacion,num_paginas;
}
