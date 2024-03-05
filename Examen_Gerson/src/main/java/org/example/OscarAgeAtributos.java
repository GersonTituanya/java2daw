package org.example;

import lombok.*;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class OscarAgeAtributos {

    private String index , year , age , name , movie;

    public void setIndex(String index) {
        this.index = index.toString();
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
