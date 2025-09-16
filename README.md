# 📚 AtividadeReforcoProg3

Projeto desenvolvido como atividade da disciplina **Programação de Computadores III**.  
O sistema permite **cadastrar e gerenciar livros** utilizando **Java + MySQL**.

---

## 🚀 Funcionalidades
- ➕ Cadastro de novos livros (nome, ano, editora, disponibilidade)  
- 🔄 Atualização da tabela em **tempo real**  
- 🗄️ Conexão com banco de dados MySQL via **JDBC**  
- 📦 Estrutura modular organizada em pacotes:  
  - `model` → classe `Livro`  
  - `database` → classe `Conexao` (responsável pela conexão com o MySQL)  
  - `dao` → classe `LivrosDAO` com métodos de CRUD  
  - `view` → JFrame com interface gráfica para cadastro e visualização  

---

## 🛠️ Tecnologias Utilizadas
- ☕ **Java**  
- 🐬 **MySQL**  
- 🔌 **JDBC (MySQL Connector)**  
- 🖥️ **NetBeans** ou outra IDE de sua preferência  

---

## 📂 Estrutura do Banco de Dados
```sql
CREATE DATABASE db_atividade_reforco;

USE db_atividade_reforco;

CREATE TABLE tb_livros (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nomeDoLivro VARCHAR(100),
  ano INT,
  editora VARCHAR(100),
  disponivel BOOLEAN
);
