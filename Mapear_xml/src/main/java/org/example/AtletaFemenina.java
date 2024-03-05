package org.example;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class AtletaFemenina implements Serializable{

    private String nombre , pais ;
    private int edad;
    private List<String> prueba;

}