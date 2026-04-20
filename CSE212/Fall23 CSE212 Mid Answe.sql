create database e_commerce;
use e_commerce;

create table orders (
	o_id varchar(50) primary key,
    o_status varchar(60)
);

create table merchants(
	m_id varchar(50) primary key,
    merchant_name varchar(70) not null,
    country_code int
);


create table products (
	p_id varchar(50) primary key,
    m_id varchar(50),
    p_name varchar(70),
    price int not null,
    p_status varchar(60),
    foreign key (m_id) references merchants(m_id)
);

create table order_items (
	o_id varchar(50) primary key,
    p_id varchar(50),
    quantity int check (quantity>10),
    foreign key (o_id) references orders(o_id),
    foreign key (p_id) references products(p_id)
);

-- b) Insert data to those tables (use your own data).
insert into orders values
('ABC101', 'Shipped'),
('ABC102', 'Delivered'),
('ABC103', 'Due Paymment');

insert into merchants values
('MN101', 'Asif', 2026),
('MN102', 'Jamal', 2025),
('MN103', 'Nahid', 2027);

insert into products values 
('P101', 'MN101', 'Mobile', 35000, 'Delivered'),
('P102', 'MN102', 'Bike', 50000, 'Shipped'),
('P103', 'MN101', 'Pen', 3000, 'Delivered');

insert into order_items value  
('ABC101', 'P101', 19),
('ABC102', 'P102', 12),
('ABC103', 'P101', 15);

-- c) Show a text concatenation of order IDs and product IDs.
select concat(o_id, ' ', p_id)
from order_items;

-- d) Show a product name starting with ‘C’ and ending with ‘r’.
select p_name 
from products
where p_name like 'C%r';

-- e) Sort the product price from the most expensive to the cheapest.
select price 
from products 
order by price desc;

-- f) Show the product name and its partial name containing 4th, 5th and 6th letters.
select p_name, substring(p_name, 4, 3)
from products;

-- g) Show the total quantity of ordered items for each product id.
select p_id, sum(quantity)
from order_items
group by p_id;

-- h) Show the product price with order quantity (using Join operation).
select p.price, o.quantity
from products p
join
order_items o on o.p_id = p.p_id;

-- i) Show the product IDs with order status “Delivered” (using subquery).
select p_id
from order_items
where o_id in (
	select o_id
    from orders
    where o_status = 'Delivered'
);

-- j) Show the product name with merchant country code 012 (using Join operation).
select p.p_name, m.country_code
from products p
join
merchants m on p.m_id = m.m_id
where m.country_code = 2025;