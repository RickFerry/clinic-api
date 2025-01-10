package com.clinic_api.repository;

import com.clinic_api.model.Sala;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalaRepository extends MongoRepository<Sala, String> {
}
