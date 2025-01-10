package com.clinic_api.model.dto;

import lombok.Data;

@Data
public class PacienteDto {
    private String id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String endereco;
}
