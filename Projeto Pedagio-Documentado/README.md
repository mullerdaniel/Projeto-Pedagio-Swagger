# Projeto Pedágio 🚗💳

Sistema de Gerenciamento de Leitura de Distância para Pedágios

## 📋 Descrição

O **Projeto Pedágio** é um sistema integrado desenvolvido para automatizar e gerenciar a leitura de distâncias percorridas por veículos em rodovias, facilitando o cálculo e cobrança de pedágios. O sistema utiliza um banco de dados relacional para armazenar e consultar informações sobre leituras de sensores.

## 🎯 Objetivo

Registrar e gerenciar dados de distância percorrida e status de veículos em passagens de pedágio, permitindo:
- Leitura automática de distâncias via sensores
- Armazenamento estruturado de dados
- Análise e relatórios de passagens
- Cálculo automático de tarifas

## 🗄️ Banco de Dados

### Estrutura do Banco

```sql
Daniel Muller, Agora
CREATE DATABASE estacionamento;

USE estacionamento;

CREATE TABLE leituras (
    id INT AUTO_INCREMENT PRIMARY KEY,
    distancia FLOAT,
    status VARCHAR(20),
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

