package com.clinic_api.repository;

import com.clinic_api.model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String> {
}
