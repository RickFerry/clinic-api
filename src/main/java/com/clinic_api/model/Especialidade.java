package com.clinic_api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "especialidades")
public class Especialidade {

    @Id
    private String id;
    private String nome;
}
