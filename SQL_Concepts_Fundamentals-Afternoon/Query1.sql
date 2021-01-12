 select p.product_code,p.product_name,s.purchase_date,COUNT(*) as total_sold
 from
 sale_details s
 JOIN
 customer c ON s.customer_id = c.customer_id
 JOIN
 product p ON p.product_code = s.product_code
 where
 c.location_code = 1
 and s.purchase_date between '2021-01-01' and '2021-01-06'
 GROUP BY p.product_code,s.purchase_date
 ORDER BY COUNT(*) DESC;