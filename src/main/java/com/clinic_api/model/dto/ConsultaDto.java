package com.clinic_api.model.dto;

import com.clinic_api.model.Consulta;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ConsultaDto {
    private String id;
    private PacienteDto paciente;
    private MedicoDto medico;
    private SalaDto sala;
    private LocalDateTime dataHora;
    private String observacoes;
}
