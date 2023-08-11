-- Criar tabela

CREATE TABLE tbCliente (
    CPF VARCHAR (11),
    NOME VARCHAR (100),
    ENDERECO1 VARCHAR (150),
    ENDERECO2 VARCHAR (150),
    BAIRRO VARCHAR (50),
    CIDADE VARCHAR (50),
    ESTADO VARCHAR (2),
    CEP VARCHAR (8),
    IDADE SMALLINT,
    SEXO VARCHAR (1),
    LIMITE_CREDITO FLOAT,
    VOLUME_COMPRA FLOAT,
    PRIMEIRA_COMPRA BIT (1));

CREATE TABLE tbProduto (
    PRODUTO VARCHAR (20),
    NOME VARCHAR (150),
    EMBALAGEM VARCHAR (050),
    TAMANHO VARCHAR (50),
    SABOR VARCHAR (50),
    PRECO_LISTA FLOAT);

-- Popular tabela

INSERT INTO tbProduto (
    PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES (
    '1040107', 'Light - 350 ml - Melancia', 'Lata', '350 ml', 'Melancia', 4.56);

INSERT INTO tbProduto (
    PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES (
    '1037797', 'Clean - 2 Litros - Laranja', 'PET', '2 Litros', 'Laranja', 16.01);

INSERT INTO tbProduto (
    PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES (
    '1000889', 'Sabor da Montanha - 700 ml - Uva', 'Garrafa', '700 ml', 'Uva', 6.31);

INSERT INTO tbProduto (
    PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES (
    '1004327', 'Videira do Campo - 1,5 Litros - Melancia', 'PET', '1,5 Litros', 'Melancia', 19.51);

SELECT * FROM tbProduto;

CREATE TABLE tbVendedor (
    MATRICULA VARCHAR (5),
    NOME VARCHAR (150),
    COMISSAO FLOAT);

INSERT INTO tbVendedor (
    MATRICULA, NOME, COMISSAO) VALUES (
    '00233', 'João Geraldo da Fonseca', 0.10);

INSERT INTO tbVendedor (
    MATRICULA, NOME, COMISSAO) VALUES (
    '00235', 'Márcio Almeida Silva', 0.08);

INSERT INTO tbVendedor (
    MATRICULA, NOME, COMISSAO) VALUES (
    '00236', 'Cláudia Morais', 0.08);

-- Atualizar dados

INSERT INTO tbProduto (
    PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES (
    '544931', 'Frescor do Verão - 350 ml - Limão', 'PET', '350 ml','Limão',3.20);

INSERT INTO tbProduto (
    PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES (
    '1078680', 'Frescor do Verão - 470 ml - Manga', 'Lata', '470 ml','Manga',5.18);

UPDATE tbProduto SET EMBALAGEM = 'Lata', PRECO_LISTA = 2.46
WHERE PRODUTO = '544931';

UPDATE tbProduto SET EMBALAGEM = 'Garrafa'
WHERE PRODUTO = '1078680';

SELECT * FROM tbProduto;

-- Deletar dados

DELETE FROM tbProduto WHERE PRODUTO = '1078680';

-- Alterar tabela (Adicionar chave primária)

ALTER TABLE tbProduto ADD PRIMARY KEY (PRODUTO);

ALTER TABLE tbCliente ADD PRIMARY KEY (CPF);

ALTER TABLE tbCliente ADD COLUMN (DATA_NASCIMENTO DATE);

INSERT INTO tbcliente (
    CPF, NOME, ENDERECO1, ENDERECO2, BAIRRO, CIDADE, ESTADO, CEP, IDADE, SEXO, LIMITE_CREDITO, VOLUME_COMPRA, PRIMEIRA_COMPRA, DATA_NASCIMENTO) VALUES (
    '00388934505', 'João da Silva', 'Rua projetada A número 10', '', 'Vila Roman', 'CARATINGA', 'AM', '2222222', 30, 'M', 10000.00, 2000, 0, '1989-10-05');

-- Filtrar buscas - 1

SELECT * FROM tbProduto WHERE PRODUTO = '544931';

SELECT * FROM tbCliente WHERE CIDADE = 'Rio de Janeiro';

SELECT * FROM tbProduto WHERE SABOR = 'Cítricos';

UPDATE tbProduto SET SABOR = 'Cítricos' WHERE SABOR = 'Limão';
SELECT * FROM tbProduto WHERE SABOR = 'Cítricos';

-- Filtrar buscas - 2

SELECT * FROM tbCliente;

SELECT * FROM tbCliente WHERE IDADE = 22; -- igual

SELECT * FROM tbCliente WHERE IDADE > 22; -- maior que

SELECT * FROM tbCliente WHERE IDADE < 22; -- menor que

SELECT * FROM tbCliente WHERE IDADE <= 22; -- menor igual

SELECT * FROM tbCliente WHERE IDADE <> 22; -- diferente de 

SELECT * FROM tbCliente WHERE NOME >= 'Fernando Cavalcante';

SELECT * FROM tbCliente WHERE NOME <> 'Fernando Cavalcante';

SELECT * FROM tbProduto;

SELECT * FROM tbProduto WHERE PRECO_LISTA > 16.008;

SELECT * FROM tbProduto WHERE PRECO_LISTA < 16.008;

SELECT * FROM tbProduto WHERE PRECO_LISTA <> 16.008;

SELECT * FROM tbProduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;

-- Filtrar buscas - 3 - Datas

SELECT * FROM tbCliente WHERE DATA_NASCIMENTO = '1995-01-13';

SELECT * FROM tbCliente WHERE DATA_NASCIMENTO > '1995-01-13';

SELECT * FROM tbCliente WHERE DATA_NASCIMENTO <= '1995-01-13';

SELECT * FROM tbCliente WHERE YEAR(DATA_NASCIMENTO) = 1995;

SELECT * FROM tbCliente WHERE MONTH(DATA_NASCIMENTO) = 10;

-- Filtrar buscas - 4 - Filtros compostos

SELECT * FROM tbProduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;

SELECT * FROM tbProduto WHERE PRECO_LISTA >= 16.007;

SELECT * FROM tbProduto WHERE PRECO_LISTA <= 16.009;

SELECT * FROM tbCliente WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M')
OR (CIDADE = 'Rio de Janeiro' OR BAIRRO = 'Jardins');