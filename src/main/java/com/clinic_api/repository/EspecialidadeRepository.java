package com.clinic_api.repository;

import com.clinic_api.model.Especialidade;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EspecialidadeRepository extends MongoRepository<Especialidade, String> {
}
