DROP TABLE IF EXISTS cards;



CREATE TABLE cards (
card_id int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
cards_number varchar(100) not null,
customer_id int not null,
card_type varchar(100) not null,
total_limit int not null,
amount_used int not null,
available_amount int not null,
create_dt date default null
);

insert into cards (cards_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt)
values ('45XXX4569', 1, 'credit', 10000, 500, 9500, CURRENT_DATE());

insert into cards (cards_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt)
values ('345XXX4570', 1, 'credit', 7500, 600, 6900, CURRENT_DATE());

insert into cards (cards_number, customer_id, card_type, total_limit, amount_used, available_amount, create_dt)
values ('245XXX4580', 1, 'credit', 20000, 4000, 16000, CURRENT_DATE());