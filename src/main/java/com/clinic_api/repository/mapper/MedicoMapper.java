package com.clinic_api.repository.mapper;

import com.clinic_api.model.Medico;
import com.clinic_api.model.dto.MedicoDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MedicoMapper {
    MedicoMapper INSTANCE = Mappers.getMapper(MedicoMapper.class);

    MedicoDto toMedicoDto(Medico medico);
    Medico toMedico(MedicoDto medicoDto);
}
