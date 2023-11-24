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
    nome_pac varchar (100)References pessoa(nome),
    data_nasc DATE ,
    email varchar(100)
);

create table farmaceutico(
    cpf varchar(11) primary key References pessoa(cpf),
    nome_farm varchar (100)References pessoa(nome),
    crf varchar (20),
    senha varchar (100)
);

create table receita (

    receita_id SERIAL PRIMARY KEY,
    cpf INT REFERENCES paciente(cpf),
    nome References paciente(nome),
    crm varchar (20),
    data_prescricao DATE,
    medicamentos TEXT,
    observacoes TEXT,   
    quantidade_preescrita int
);
CREATE TABLE dispensa (
    dispensa_id SERIAL PRIMARY KEY,
    receita_id INT REFERENCES receita(receita_id),
    cpf_paciente VARCHAR(11) REFERENCES paciente(cpf),
    nome_paciente VARCHAR(100) REFERENCES paciente(nome),
    crm_farmaceutico VARCHAR(20) REFERENCES farmaceutico(crf),
    nome_farmaceutico VARCHAR(100) REFERENCES farmaceutico(nome),
    medicamento_nome VARCHAR(100) REFERENCES remedio(nome),
    medicamento_lote INT REFERENCES remedio(lote),
    quantidade_preescrita INT,
    data_dispensa DATE
);

