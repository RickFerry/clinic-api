package com.clinic_api.repository.mapper;

import com.clinic_api.model.Paciente;
import com.clinic_api.model.dto.PacienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PacienteMapper {
    PacienteMapper INSTANCE = Mappers.getMapper(PacienteMapper.class);

    PacienteDto toPacienteDto(Paciente paciente);
    Paciente toPaciente(PacienteDto pacienteDto);
}
