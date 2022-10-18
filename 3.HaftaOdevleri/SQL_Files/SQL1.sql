select *from customers;

select * from customers where  city = 'London';

--case insesivite
select* from products where category_id = 1 or category_id = 3;

select* from products where category_id = 1 and unit_price >= 10;

select * from products where category_id = 1 order by unit_price asc; --ascending(artan) , descending(azalan)

select count(category_id) from products;

select category_id,count(*) from products where unit_price > 20
                                          group by category_id having count(*)<10;

select * from products inner join categories on
    products.category_id = categories.category_id where products.unit_price > 10;

select * from products p inner join order_details od on p.product_id = od.product_id inner join orders o on o.order_id = od.order_id;

select * from products p left join order_details od on p.product_id = od.product_id;

select * from customers c left join orders o on c.customer_id = o.customer_id where o.customer_id is null;









