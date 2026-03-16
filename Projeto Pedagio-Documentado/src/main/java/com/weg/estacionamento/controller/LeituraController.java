package com.weg.estacionamento.controller;

import com.weg.estacionamento.model.Leitura;
import com.weg.estacionamento.repository.LeituraRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller responsável por gerenciar as leituras do estacionamento.
 * Fornece endpoints para listar e registrar leituras.
 *
 * @author Daniel Muller
 * @version 1.0
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/leituras")
@Tag(name = "Leituras", description = "API para gerenciamento das leituras do estacionamento")
public class LeituraController {

    private final LeituraRepository repository;

    public LeituraController(LeituraRepository repository) {
        this.repository = repository;
    }

    /**
     * Lista todas as leituras registradas.
     *
     * @return lista de leituras
     */
    @Operation(summary = "Lista todas as leituras", description = "Retorna todas as leituras registradas no sistema")
    @GetMapping
    public List<Leitura> listar() {
        return repository.findAll();
    }

    /**
     * Salva uma nova leitura no sistema.
     *
     * @param leitura objeto contendo os dados da leitura
     * @return leitura salva no banco de dados
     */
    @Operation(summary = "Salva uma nova leitura", description = "Registra uma nova leitura no sistema")
    @PostMapping
    public Leitura salvar(@RequestBody Leitura leitura) {
        return repository.save(leitura);
    }
}