package com.weg.estacionamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller responsável por gerenciar o carregamento das páginas da aplicação.
 * Neste caso, ele abre a página principal do sistema.
 *
 * @author Daniel Muller
 * @version 1.0
 */

@Controller
public class PageController {

    /**
     * Abre a página principal da aplicação.
     *
     * @return nome da página index que será renderizada
     */
    @GetMapping("/")
    public String abrirPagina() {
        return "index";
    }
}