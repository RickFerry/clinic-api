package com.clinic_api.controller;

import com.clinic_api.model.Consulta;
import com.clinic_api.service.ConsultaService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@AllArgsConstructor
@RequestMapping("/consulta")
public class ConsultaController {
    private final ConsultaService consultaService;

    @GetMapping
    public ResponseEntity<Page<Consulta>> listar(Pageable page) {
        return ResponseEntity.ok(consultaService.listar(page));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Consulta> buscarPorId(@PathVariable String id) {
        return ResponseEntity.ok(consultaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Consulta> salvar(@RequestBody Consulta consulta, UriComponentsBuilder uriBuilder) {
        Consulta consultaSalva = consultaService.salvar(consulta);
        return ResponseEntity.created(uriBuilder.path(
                "/consulta/{id}").buildAndExpand(consulta.getId()).toUri()).body(consultaSalva);
    }
}
