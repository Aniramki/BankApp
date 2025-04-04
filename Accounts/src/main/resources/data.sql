DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;


CREATE TABLE customer (
customer_id int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
name varchar(100) not null,
email varchar(100) not null,
mobile_number varchar(20) not null,
create_dt date default null
);

CREATE TABLE accounts (
    account_number int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    customer_id int not null,
    account_type varchar(100) not null,
    branch_address varchar(200) not null,
    create_dt timestamp default null,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE
);

insert into customer (name,email,mobile_number,create_dt)
values ('Maryna', 'maryna@gmail.com', '123456', CURRENT_DATE());

insert into accounts (customer_id,account_type,branch_address,create_dt)
values (1,'Savings','123 Main Street, New York', CURRENT_DATE());