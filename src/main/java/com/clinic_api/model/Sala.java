package com.clinic_api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "salas")
public class Sala {

    @Id
    private String id;
    private String numero;
    private String descricao;
}
