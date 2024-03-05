package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        AtletaFemenina atleta1=new AtletaFemenina("Maria","España",19, Collections.singletonList("judo"));
        AtletaFemenina atleta2=new AtletaFemenina("Maria2","Francia",20, Collections.singletonList("carrera"));
        AtletaFemenina atleta3=new AtletaFemenina("Maria3","Portugal",21, Collections.singletonList("lanzmiento"));
        AtletaFemenina atleta4=new AtletaFemenina("Maria4","Colombia",22, Collections.singletonList("natacion"));
        AtletaFemenina atleta5=new AtletaFemenina("Maria5","Italia",23, Collections.singletonList("salto"));
        AtletaFemenina atleta6=new AtletaFemenina("Maria6","Alemania",24, Collections.singletonList("tenis"));
        AtletaFemenina atleta7=new AtletaFemenina("Maria7","Rusia",25, Collections.singletonList("surf"));
        AtletaFemenina atleta8=new AtletaFemenina("Maria8","EEUU",126, Collections.singletonList("judo"));





        List<AtletaFemenina> atletas = new ArrayList<AtletaFemenina>();

        atletas.add(atleta1);atletas.add(atleta2);atletas.add(atleta3);atletas.add(atleta4);
        atletas.add(atleta5);atletas.add(atleta6);atletas.add(atleta7);atletas.add(atleta8);


        Path ficheroObjetoXml = Path.of(".", "src", "main", "resources", "atletas_femeninas.xml");



        Metodos.escribirListaObjetosXml(atletas,ficheroObjetoXml);

        System.out.println(Metodos.leerListaObjetosXml(atletas));

    }
}