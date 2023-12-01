CREATE Table remedio(
    rem_cod int PRIMARY KEY,
    nome VARCHAR(100),
    lote int,
    data_valid Date
);

Create Table pessoa (
    cpf varchar(11) PRIMARY Key,
    nome varchar (100)
);

Create Table paciente(
    cpf VARCHAR(11) PRIMARY KEY REFERENCES pessoa(cpf),
    nome_pac VARCHAR(100),
    data_nasc DATE,
    email VARCHAR(100)
);
drop table paciente;
create table farmaceutico(
    cpf varchar(11) primary key References pessoa(cpf),
    nome_farm varchar (100),
    crf varchar (20),
    senha varchar (100)
);
CREATE TABLE receita (
    receita_id SERIAL PRIMARY KEY,
    cpf_paciente VARCHAR(11) REFERENCES paciente(cpf),
    crm VARCHAR(20),
    medicamento_nome varchar (50),
    medicamento_lote varchar (50),
    quantidade_preescrita INT,
    data_prescricao DATE,
    medicamentos TEXT,
    observacoes TEXT
);

CREATE TABLE dispensa (
    dispensa_id SERIAL PRIMARY KEY,
    receita_id INT,
    cpf_paciente VARCHAR(11),
    crm_farmaceutico VARCHAR(20),
    medicamento_nome VARCHAR(100),
    medicamento_lote INT,
    quantidade_preescrita INT,
    data_dispensa DATE
);


