CREATE DATABASE  IF NOT EXISTS Inventarios;

USE Inventarios;

CREATE TABLE categorias(
   cdCategoria int(11) NOT NULL AUTO_INCREMENT,
   descricao  varchar(50) NOT NULL,
   CONSTRAINT pk_categorias
      PRIMARY KEY(cdCategoria)
);

CREATE TABLE produtos(
   cdProduto int(11) NOT NULL AUTO_INCREMENT,
   nome varchar(50) NOT NULL,
   preco float     NOT NULL,
   quantidade int     NOT NULL,
   cdCategoria int     NOT NULL,
   CONSTRAINT pk_produtos
      PRIMARY KEY(cdProduto),
   CONSTRAINT fk_produtos_categorias
      FOREIGN KEY(cdCategoria)
      REFERENCES categorias(cdCategoria)
);

CREATE TABLE colaboradores(
   cdColaborador int(11) NOT NULL AUTO_INCREMENT,
   nome varchar(50) NOT NULL,
   numero varchar(50) NOT NULL,
   telefone varchar(50) NOT NULL,
   CONSTRAINT pk_colaboradores
      PRIMARY KEY(cdColaborador)
);

CREATE TABLE inventarios(
   cdInventario int(11) NOT NULL AUTO_INCREMENT,
   data date NOT NULL,
   valor float NOT NULL,
   Levantar boolean NOT NULL,
   cdColaborador int,
   CONSTRAINT pk_inventarios
      PRIMARY KEY(cdInventario),
   CONSTRAINT fk_inventarios_colaboradores
      FOREIGN KEY(cdColaborador)
      REFERENCES colaboradores(cdColaborador)
);

CREATE TABLE itensdeinventario(
   cdItemDeInventario int(11) NOT NULL AUTO_INCREMENT,
   quantidade int NOT NULL,
   valor float NOT NULL,
   cdProduto int,
   cdInventario int,
   CONSTRAINT pk_itensdeinventario
      PRIMARY KEY(cdItemDeInventario),
   CONSTRAINT fk_itensdeinventario_produtos
      FOREIGN KEY(cdProduto)
      REFERENCES produtos(cdProduto),
   CONSTRAINT fk_itensdeinventario_inventarios
      FOREIGN KEY(cdInventario)
      REFERENCES inventarios(cdInventario)
);
