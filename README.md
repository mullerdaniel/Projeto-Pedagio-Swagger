<h1 align="center">Projeto-Pedagio-Swagger</h1><br>

## Banco de Dados
CREATE DATABASE estacionamento;<br>
USE estacionamento;<br>

CREATE TABLE leituras (<br>
    id INT AUTO_INCREMENT PRIMARY KEY,<br>
    distancia FLOAT,<br>
    status VARCHAR(20),<br>
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP<br>
);<br><br>

<h1 align="center">Swagger</h1><br>
- Para conseguir rodar o swagger você deve clonar o projeto e estar com o banco de dados rodando.<br><br>
- Você deve executar está classe:<br>
<img width="217" height="29" alt="image" src="https://github.com/user-attachments/assets/ef6c4a0c-748c-49ca-8c22-36f49779c46e" /><br><br>

- Enquanto o projeto estiver executado, você deve colocar está URL em um navegador: (http://localhost:8080/swagger-ui.html).<br>
<img width="1919" height="764" alt="image" src="https://github.com/user-attachments/assets/7000f15c-57fc-4699-9416-591bf75c3fc6" />

