package com.clinic_api.model.dto;

import lombok.Data;

@Data
public class MedicoDto {
    private Long id;
    private String nome;
    private String crm;
    private EspecialidadeDto especialidade;
    private String telefone;
    private String email;
}
