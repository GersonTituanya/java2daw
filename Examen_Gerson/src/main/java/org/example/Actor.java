package org.example;

import java.util.List;
import lombok.*;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Actor {

    private String nombre , sexo ;
    private int anyoNacimiento ;

    private List<Pelicula> peliculas;
}
