CREATE Table remedio(
    registro_anvisa VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(100),
    lote int,
    data_valid Date
);

Create Table pessoa (
    cpf varchar(11) PRIMARY Key,
    nome varchar (100)
);

Create Table paciente(
    cpf varchar(11) primary key References pessoa(cpf),
    nome varchar (100)References pessoa(nome),
    data_nasc DATE ,
    email varchar(100)
);

create table farmaceutico(
    cpf varchar(11) primary key References pessoa(cpf),
    nome varchar (100)References pessoa(nome),
    crf varchar (20),
    senha varchar (100)
);

create table receita (

    receita_id SERIAL PRIMARY KEY,
    cpf INT REFERENCES paciente(cpf),
    crm varchar (20),
    data_prescricao DATE,
    medicamentos TEXT,
    observacoes TEXT
);

