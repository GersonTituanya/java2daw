package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;

public class Main {

    static List<Emojis> emojis;

    static ObjectMapper objectMapper = new JsonMapper();


    public static void main(String[] args) throws IOException {

        JsonNode root = objectMapper.readTree(new URL("https://emojihub.yurace.pro/api/all"));


        emojis = objectMapper.readValue

        (root.traverse(),new TypeReference<>(){});

            emojis.forEach(System.out::println);



        Path ficheroJson = Path.of(".", "src", "main", "resources", "emojis.json");

        Metodos.escribirListaObjetosJson(emojis, ficheroJson);

        System.out.println(Metodos.leerObjetoJson(emojis));

    }

}