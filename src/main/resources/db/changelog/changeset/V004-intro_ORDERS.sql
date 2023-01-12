--liquibase formatted sql
--changeset "Nikolay Erofeev":4


insert into orders (customer_id, product_name, amount)
values ('1', 'Батон', 100.00);
