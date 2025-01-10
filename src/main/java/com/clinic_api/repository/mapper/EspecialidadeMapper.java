package com.clinic_api.repository.mapper;

import com.clinic_api.model.Especialidade;
import com.clinic_api.model.dto.EspecialidadeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EspecialidadeMapper {
    EspecialidadeMapper INSTANCE = Mappers.getMapper(EspecialidadeMapper.class);

    EspecialidadeDto toEspecialidadeDto(Especialidade especialidade);
    Especialidade toEspecialidade(EspecialidadeDto especialidadeDto);
}
