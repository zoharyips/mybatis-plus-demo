create database test;

-- auto-generated definition
create table test_department
(
    id   String           default '',
    name Nullable(String) default ''
)
    engine = File('TabSeparated');

-- auto-generated definition
create table test_employee
(
    id            String           default '',
    name          Nullable(String) default '',
    age           Nullable(Int32)  default 0,
    address       Nullable(String) default '',
    department_id Nullable(String) default ''
)
    engine = File('TabSeparated');

insert into test_department values ('1', 'HELLO DEPARTMENT');

insert into test_employee values ('1', 'Alex', 18, 'China', '1'), ('2', 'Jack', 20, 'US', '1');