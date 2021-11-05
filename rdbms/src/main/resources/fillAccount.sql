--liquibase formatted sql

--changeset viktorzebra:fillAccount

insert into account(id, amount,  version) values (1, 100, 0);
insert into account(id, amount,  version) values (2, 0, 0);
insert into account(id, amount,  version) values (3, 1000, 0);
insert into account(id, amount,  version) values (4, 500, 0);