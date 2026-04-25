# 📝 Gerenciador de Tarefas - Lab. Desenvolvimento Multiplataforma

Este repositório contém o **Projeto Avaliativo do 1º Bimestre**, desenvolvido para a disciplina de Laboratório de Desenvolvimento Multiplataforma. Trata-se de uma API REST robusta para gerenciamento de tarefas (To-Do List).

## 👨‍💻 Autores
* Henrique Almeida Florentino
* Luiz Felipe Vieira Soares

---

## 📌 Sobre o Projeto

O projeto consiste em um sistema de backend desenvolvido com **Spring Boot** e **PostgreSQL**, focado em fornecer um CRUD completo para o controle de atividades cotidianas. 

A aplicação foi estruturada seguindo o padrão de arquitetura em camadas (**Controller, Service, Repository**), garantindo uma separação clara de responsabilidades e facilidade de manutenção.

### 🛠 Funcionalidades Principais
* **Criação de Tarefas:** Registro de novas atividades com nome, descrição e observações.
* **Listagem Dinâmica:** Consulta de todas as tarefas armazenadas no banco de dados.
* **Atualização de Dados:** Edição de informações e alteração do status da tarefa.
* **Remoção (Delete):** Exclusão definitiva de registros.
* **Gestão de Datas:** Controle automático de `data_criacao` e `data_atualizacao`.

---

## ⚙️ Tecnologias Utilizadas

O ecossistema do projeto foi construído com as seguintes ferramentas:

* **Java 17:** Linguagem base do projeto.
* **Spring Boot 3.x:** Framework para agilizar o desenvolvimento da API.
* **Spring Data JPA:** Abstração para persistência de dados e mapeamento objeto-relacional (ORM).
* **PostgreSQL:** Banco de dados relacional de alta performance.
* **Maven:** Gerenciador de dependências e build.
* **JUnit 5:** Framework para testes automatizados.

---

## 🚀 Como Executar o Projeto

Siga os passos abaixo para configurar o ambiente localmente:

### 1. Clonar o Repositório
```bash
git clone https://github.com/luizfelipesoarees/lab-des-mult-projeto1-gerenciamento-tarefas.git
cd lab-des-mult-projeto1-gerenciamento-tarefas
```

### 2. Configurar o Banco de Dados
Certifique-se de que o **PostgreSQL** está em execução. Você pode criar o banco de dados manualmente ou utilizar o script fornecido no projeto:

**Script SQL:**
```sql
CREATE TABLE tarefa (
    id BIGSERIAL PRIMARY KEY,
    data_atualizacao TIMESTAMP(6),
    data_criacao TIMESTAMP(6),
    descricao VARCHAR(255),
    nome VARCHAR(255),
    observacoes VARCHAR(255),
    status VARCHAR(255)
);
```

### 3. Configurar Credenciais (Properties)
Para manter a segurança, as credenciais originais não estão no repositório. Siga estas etapas:
1. Localize o arquivo `src/main/resources/application.properties.example`
2. Renomeie-o para `application.properties`
3. Preencha as informações conforme seu ambiente local:

```properties
spring.application.name=labdesmultprojeto1gerenciamentotarefas
spring.datasource.url=jdbc:postgresql://localhost:XXXX/tarefas
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 4. Rodar a Aplicação
Você pode iniciar o projeto pela sua IDE de preferência ou via terminal:
```bash
./mvnw spring-boot:run
```
A API estará disponível em: `http://localhost:8080`

---

## 🧪 Testes Automatizados

A confiabilidade do código é garantida por testes de integração que cobrem todas as operações do CRUD.

* **Classe Principal de Teste:** `Labdesmultprojeto1gerenciamentotarefasApplicationTests`
* **Cenários Testados:**
    * Criação de tarefas com sucesso.
    * Busca e validação de registros.
    * Fluxo de atualização de status e dados.
    * Exclusão de registros do banco de dados.

Para rodar os testes, utilize o comando:
```bash
./mvnw test
```
Você tambmém pode iniciar os testes pelo arquivo Labdesmultprojeto1gerenciamentotarefasApplicationTests
