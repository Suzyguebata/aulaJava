# isto é um comentário

# 4 operações de BD:
# CRUD = create, read, Update, delete
# SQL - dados = INSERT, SELECT, UPDATE, DELETE
# atalho para executar a linha:
#CTRL + ENTER
# 1 - criar u novo banco de dados
create database banco_itau;

#tirna um banco padrão:
use banco_itau;

#Criar uma table no banco
create table departamento(
	id smallint not null auto_increment,
    nome varchar(50),
    andar smallint,
    constraint pk_depto primary key (id)
);

create table funcionario (
	id smallint not null auto_increment,
    nome varchar(120),
    email varchar(80) unique,
    salario float,
    id_depto smallint not null,
    
    constraint pk_funcionario primary key (id),
    constraint fk_depto_func foreign key (id_depto) references departamento (id)
);

#inserir dados na tabela
insert into departamento values(
	null,'Financeiro',3
);
insert into departamento values(
	null,'Juridico',3
);
insert into departamento values(
	null,'TI',3
);

#inserir dados de funcionários
insert into funcionario values (
	null, 'Carlos Peres', 'carlos@itau.com.br', 2000, 1
);
insert into funcionario values (
	null, 'Ana Cristina', 'ana@itau.com.br', 3000 , 2
);
insert into funcionario values (
	null, 'Renato', 'renato@itau.com.br', 1500 , 2
);

#apaga dados da tabela
delete from departamento where id = 4;

#altera os dados da tabela
Update funcionario set salario = 3200 where id = 2; 

#selecionando dados do banco

# slect [colunas] from [table] where [condição]

select nome , email from funcionario;
select email from funcionario where id =1;
select email from funcionario where nome like 'Carlos%';

# qual o nome do deparamento do Carlos?
select departamento.nome from departamento inner join funcionario where departamento.id = funcionario.id_depto and  funcionario.nome like 'Carlos%';

#qual o salário da Ana?alter
select salario from funcionario where nome like 'Ana%';

#listar nomes e salarios ordenados por salario
select nome,salario from funcionario order by salario;

# quais são so fucionarios do departamento juridico?
select funcionario.nome from departamento inner join funcionario where departamento.id = funcionario.id_depto and departamento.id = 2;