CREATE DATABASE loja_virtual;

USE loja_virtual;

CREATE TABLE produto (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao VARCHAR(255), PRIMARY KEY (id)) Engine = InnoDB;

INSERT INTO produto (nome, descricao) VALUES ('NOTEBOOK', 'NOTEBOOK SAMSUNG');
INSERT INTO produto (nome, descricao) VALUES ('GELADEIRA', 'GELADEIRA BRASTEMP');

SELECT * FROM produto;

CREATE TABLE categoria (id INT AUTO_INCREMENT, nome VARCHAR (50) NOT NULL, PRIMARY KEY (id)) Engine = InnoDB;

INSERT INTO categoria (nome) VALUES ('ELETRONICOS');
INSERT INTO categoria (nome) VALUES ('ELETRODOMESTICOS');
INSERT INTO categoria (nome) VALUES ('MOVEIS');

ALTER TABLE produto ADD COLUMN categoria_id INT;

ALTER TABLE produto ADD FOREIGN KEY (categoria_id) REFERENCES categoria (ID);

UPDATE produto SET categoria_id = 1 WHERE id = 1;

UPDATE produto SET categoria_id = 2 WHERE id = 18;