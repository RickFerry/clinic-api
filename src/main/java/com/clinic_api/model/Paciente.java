package com.clinic_api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pacientes")
public class Paciente {

    @Id
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String endereco;
}
