package com.Leticia.springMongoDB.entitys;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "usuarios")

public class Usuario {

    @Id
    private String id;

    private String nome;

    private Integer idade;
}
