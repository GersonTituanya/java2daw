package org.example;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Metodos {



    public static String leerListaObjetosXml(List<AtletaFemenina> lista) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            // La siguiente línea es opcional, pero hace que el XML se muestre con formato
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
            return xmlMapper.writeValueAsString(lista);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirListaObjetosXml(List<AtletaFemenina> lista, Path ruta) {

        try {
            Files.deleteIfExists(ruta);
            XmlMapper xmlMapper = new XmlMapper();
            // La siguiente línea es opcional, pero hace que el JSON se muestre con formato
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
            xmlMapper.writeValue(ruta.toFile(), lista);
        } catch (IOException e) {
            System.out.println("El fichero no existe");
        }
    }

}
