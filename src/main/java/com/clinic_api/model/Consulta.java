package com.clinic_api.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "consultas")
public class Consulta {

    @Id
    private String id;

    @DBRef
    private Paciente paciente;

    @DBRef
    private Medico medico;

    @DBRef
    private Sala sala;

    private LocalDateTime dataHora;
    private String observacoes;
}
