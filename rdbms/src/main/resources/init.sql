--liquibase formatted sql

--changeset viktorzebra:init

create table if not exists account
(
    id bigserial constraint account_pk primary key,
    amount int check(amount >= 0),
    version int
);


