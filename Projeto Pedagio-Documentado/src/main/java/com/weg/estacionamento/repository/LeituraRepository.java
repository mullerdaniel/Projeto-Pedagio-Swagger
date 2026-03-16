package com.weg.estacionamento.repository;

import com.weg.estacionamento.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório responsável pelo acesso e manipulação dos dados
 * da entidade Leitura no banco de dados.
 *
 * Utiliza os recursos do Spring Data JPA para fornecer operações
 * básicas como salvar, buscar, atualizar e deletar registros.
 *
 * @author Daniel Muller
 * @version 1.0
 */

public interface LeituraRepository extends JpaRepository<Leitura, Long> {

}