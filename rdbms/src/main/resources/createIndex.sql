--liquibase formatted sql

--changeset viktorzebra:createIndex

CREATE INDEX idx_account ON account(id);