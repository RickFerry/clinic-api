package com.clinic_api.repository.mapper;

import com.clinic_api.model.Sala;
import com.clinic_api.model.dto.SalaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SalaMapper {
    SalaMapper INSTANCE = Mappers.getMapper(SalaMapper.class);

    SalaDto toSalaDto(Sala sala);
    Sala toSala(SalaDto salaDto);
}
