package org.example;
import java.io.Serializable;
import java.util.Date;
import lombok.*;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Funkos implements Serializable {

    private String cod , nombre , modelo;
    private double precio;
    private String fecha_lanzamiento;

}
