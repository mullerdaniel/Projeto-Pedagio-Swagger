package com.weg.estacionamento.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

/**
 * Entidade que representa uma leitura realizada pelo sistema de estacionamento.
 * Cada leitura armazena informações como distância detectada,
 * status da vaga e data/hora do registro.
 *
 * @author Daniel Muller
 * @version 1.0
 */

@Getter
@Setter
@Entity
@Table(name = "leituras")
public class Leitura {

    /**
     * Identificador único da leitura.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Distância medida pelo sensor.
     */
    private Float distancia;

    /**
     * Status da vaga (por exemplo: livre ou ocupada).
     */
    private String status;

    /**
     * Data e hora em que a leitura foi registrada.
     */
    @Column(name = "data_hora")
    private LocalDateTime dataHora;
}