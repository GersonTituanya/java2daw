package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Emojis {
    String name,category,group;
}
