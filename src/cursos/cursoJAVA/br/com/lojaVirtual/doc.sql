CREATE DATABASE loja_virtual;

USE loja_virtual;

CREATE TABLE produto (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao VARCHAR(255), PRIMARY KEY (id)) Engine = InnoDB;

INSERT INTO produto (nome, descricao) VALUES ('NOTEBOOK', 'NOTEBOOK SAMSUNG');

SELECT * FROM produto;