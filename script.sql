insert into CUSTOMERS (name, surname, age, phone_number)
values ('Алексей', 'Сидоров', 22, '+79123456789');

insert into CUSTOMERS (name, surname, age, phone_number)
values ('Петр', 'Сидоров', 22, '+79123456789');

insert into orders (amount, date, product_name, customer_id)
values (100.00, now(), 'Батон','1');

insert into orders (amount, date, product_name, customer_id)
values (100.00, now(), 'Кефир','2');

insert into orders (amount, date, product_name, customer_id)
values (100.00, now(), 'яйца','1');
