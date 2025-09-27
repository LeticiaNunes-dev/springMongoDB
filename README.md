# Projeto de demonstração: springMongoDB - Serviço CRUD

## 🚀 Visão Geral
Projeto de demonstração para uma API RESTful completa (CRUD - Create, Read, Update, Delete) utilizando a stack moderna: Spring Boot 3 e persistência de dados em um ambiente NoSQL (MongoDB).

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17
* **Framework:** Spring Boot 3.5.6
* **Banco de Dados:** MongoDB (Spring Data)
* **Simplificação de Código:** Lombok

## ⚙️ Como Rodar o Projeto

### Pré-requisitos
1.  **Java 17** (ou superior).
2.  **Maven** (Gerenciador de Dependências).
3.  **MongoDB** (Serviço local rodando na porta 27017).

### Conexão com o Banco de Dados
Para rodar, você deve configurar o arquivo `application.properties` com sua URI do MongoDB local ou Atlas.

> **Atenção:** O arquivo `application.properties` é ignorado pelo Git por segurança.

### Build e Execução
Execute o projeto a partir da sua IDE (IntelliJ) ou use o comando Maven:
```bash
mvn spring-boot:run
