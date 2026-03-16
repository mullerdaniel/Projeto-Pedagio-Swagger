package com.weg.estacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal responsável por iniciar a aplicação de gerenciamento
 * de estacionamento utilizando o framework Spring Boot.
 *
 * Esta classe contém o método main que inicializa o contexto da aplicação
 * e inicia o servidor embutido.
 *
 * @author Daniel Muller
 * @version 1.0
 */

@SpringBootApplication
public class EstacionamentoApplication {

	/**
	 * Método principal responsável por iniciar a aplicação Spring Boot.
	 *
	 * @param args argumentos de inicialização da aplicação
	 */
	public static void main(String[] args) {
		SpringApplication.run(EstacionamentoApplication.class, args);
	}

}