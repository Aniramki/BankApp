DROP TABLE IF EXISTS loans;

CREATE TABLE loans (
loans_number int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
customer_id int not null,
start_dt date not null,
loan_type varchar(100) not null,
total_loan int not null,
amount_paid int not null,
outstanding_amount int not null,
create_dt date default null
);

insert into loans (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
values ( 1, CURRENT_DATE()-250, 'Home', 200000, 50000, 150000, CURRENT_DATE()-250);

insert into loans (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
values ( 1, CURRENT_DATE()-376, 'Vehicle', 40000, 10000, 30000, CURRENT_DATE()-376);

insert into loans (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
values ( 1, CURRENT_DATE()-122, 'Personal', 10000, 3500, 6500, CURRENT_DATE()-122);

insert into loans (customer_id, start_dt, loan_type, total_loan, amount_paid, outstanding_amount, create_dt)
values ( 1, CURRENT_DATE()-549, 'Home', 50000, 10000, 40000, CURRENT_DATE()-549);