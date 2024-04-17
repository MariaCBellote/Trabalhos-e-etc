create database if not exists hospital;
use hospital;

create table if not exists cargo (
id_cargo int primary key,
nome varchar(45) not null
);

create table if not exists riscos_ocupacionais(
id_riscos int(11) primary key,
nome varchar(45)not null
);

create table if not exists resultado_exame(
id_resultado int(11) primary key,
tipo varchar(50) not null
);

create table if not exists tipo_exame(
id_tipo int(11) primary key,
tipo varchar(50)
);

create table if not exists medicos(
id_medico int(11) primary key,
crm int(11) not null,
nome varchar(45) not null,
cpf varchar(20) not null,
especialidade varchar(50) not null,
data_nascimento date not null,
endereço varchar(50) not null,
telefone varchar(20)
);

create table if not exists atestado(
id_atestado int(11) primary key,
resultados_riscos varchar(100) not null,
resultado varchar(100) not null,
observçoes varchar(300) not null,
-- fk --
id_medico int(11) not null,
constraint medico_id foreign key(id_medico) references medicos(id_medico) 
);

create table if not exists exame(
id_exame int(11) primary key,
especialidade varchar(50) not null,
data_relacao date not null,
-- fks --
id_resultado int(11) not null,
constraint resultado_id foreign key(id_resultado) references resultado_exame(id_resultado),
id_tipo int(11) not null,
constraint tipo_id foreign key(id_tipo) references tipo_exame(id_tipo)
);

create table if not exists empresa(
id_empresa int(11) primary key,
cnpj varchar(50) not null,
nome varchar(50) not null,
endereço varchar(50) not null,
telefone varchar(20) not null,
-- fk --
id_empressa int(11) not null,
constraint empresa_id foreign key(id_empresa) references empresa(id_empresa)
);

create table if not exists funcionario(
id_funcionario int(11) primary key,
nome varchar(50) not null,
cpf varchar(20) not null, 
data_nascimento date not null,
endereco varchar(50) not null,
telefone varchar(50) not null,
-- fk--
id_cargo int(11) not null,
constraint cargo_id foreign key(id_cargo) references cargo(id_cargo),
id_empresa int(11) not null,
constraint empresa_id foreign key(id_empresa) references empresa(id_empresa)  

);

create table if not exists empresa_exame(
id_empresa int,
id_exame int,
primary key(id_empresa,id_exame),
constraint exameid foreign key(id_exame) references exame(id_exame),
constraint emp_id foreign key(id_empresa) references empresa(id_empresa)
);

create table if not exists funcionario_exame(
id_exame int,
id_funcionario int,
primary key(id_exame,id_funcionario),
constraint exameid foreign key(id_exame) references exame(id_exame),
constraint func_id foreign key(id_funcionario) references funcionario(id_funcionario)
);

create table if not exists exame_atestado(
id_exame int,
id_atestado int,
primary key(id_exame,id_atestado),
constraint exameid foreign key(id_exame) references exame(id_exame),
constraint atest_id foreign key(id_atestado) references atestado(id_atestado)
);

create table if not exists cargo_riscopa(
id_cargo int,
id_riscos int,
primary key(id_cargo,id_riscos),
constraint cargo_id foreign key(id_cargo) references cargo(id_cargo),
constraint riscos_id foreign key(id_riscos) references riscos_ocupacionais(id_riscos)
);







