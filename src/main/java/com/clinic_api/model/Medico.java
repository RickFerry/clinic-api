package com.clinic_api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "medicos")
public class Medico {

    @Id
    private String id;
    private String nome;
    private String crm;

    @DBRef
    private String especialidade;

    private String telefone;
    private String email;
}
