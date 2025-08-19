<h1 align="center">🧠 Fórum Hub API</h1>

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-green?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-3.8-blue?style=for-the-badge&logo=apachemaven)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)
![Flyway](https://img.shields.io/badge/Migrations-Flyway-red?style=for-the-badge&logo=flyway)
![JWT](https://img.shields.io/badge/JWT-Security-orange?style=for-the-badge&logo=jsonwebtokens)
![Lombok](https://img.shields.io/badge/Lombok-enabled-yellow?style=for-the-badge&logo=lombok)
![License](https://img.shields.io/badge/License-Apache2.0-gree?style=for-the-badge&logo=apache)

- O ForumHub é uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de cursos, tópicos, respostas e usuários em um fórum de discussão.

[📚 Tecnologias Utilizadas](#-tecnologias-utilizadas) - [🛠️ Funcionalidades](#-funcionalidades) - [🔐 Segurança](#-segurança) - [🔎 Endpoints](#-endpoints) - [⚙️ Como rodar o projeto localmente](#-como-rodar-o-projeto-localmente) - [🧪 Testes](#-testes) - [📄 Documentação](#-documentação) - [🧾 Licença](#-licença) - [👩‍💻 Autora](#-autora)

---

## 📚 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security 
- Token JWT
  - Auth0
- Bean Validation
- Flyway para criação do banco de dados
- MySQL
- Testes unitários:
  - JUnit 5
  - Mockito
- Lombok
- Maven
- Swagger/OpenAPI

---

## 🛠️ Funcionalidades

- ✅ Cadastro de usuários com validação de senha forte
- ✅ Autenticação com JWT
- ✅ Controle de acesso:

  - ✅ **Tópicos**:
    - Apenas `USER` autenticado podem criar novos tópicos
    - Apenas o autor pode editar um tópico
    - Apenas o autor pode atualizar o STATUS de um tópico como SOLUCIONADO
    - Tópicos SOLUCIONADOS não podem ser editados nem receber novas respostas - *Validado*
    - Filtragem de tópicos por data de criação (mais recentes primeiro)
    - Filtragem por termo no título (case-insensitive)
    - Listagem de topicos por nome do curso ou autor
    - Somente o autor e `ADMIN` podem deletar um tópico - *Validado*
    
  - ✅ **Respostas**: 
    - Apenas `USER` autenticado pode responder um tópico
    - Listagem de respostas por tópico ou autor
    - Somente o autor e `ADMIN` podem deletar uma resposta
- ✅ Paginação e ordenação nos endpoints de listagem

