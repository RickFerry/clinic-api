package com.clinic_api.repository;

import com.clinic_api.model.Consulta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsultaRepository extends MongoRepository<Consulta, String> {
}
