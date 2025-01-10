package com.clinic_api.service;

import com.clinic_api.model.Consulta;
import com.clinic_api.repository.ConsultaRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ConsultaService {
    private final ConsultaRepository consultaRepository;

    @Transactional(readOnly = true)
    public Page<Consulta> listar(Pageable page) {
        return consultaRepository.findAll(page);
    }

    @Transactional(readOnly = true)
    public Consulta buscarPorId(String id) {
        return consultaRepository.findById(id).orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
    }

    @Transactional
    public Consulta salvar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
}
