--Sintaxe
CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] db_name
      [create_specification]

   create_specification:
            [DEFAULT] CHARACTER SET [=] charset_name
            [DEFAULT] COLLATE [=] collation_name
            DEFAULT ENCRYPTION [=] { 'Y' | 'N'}

--Exemplo
CREATE SCHEMA `sucos2` DEFAULT CHARACTER SET utf8;

--Sintaxe
DROP {DATABASE | SCHEMA} [IF EXISTS] db_name

--Exemplo
DROP DATABASE `sucos2`;