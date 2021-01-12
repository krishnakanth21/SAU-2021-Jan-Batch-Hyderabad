select
s.sales_executive_id,s1.sales_executive_name,s1.sales_executive_DOB,s1.sales_executive_gender
,SUM(quantity) as No_of_Products_Sold
from
sale_details as s 
INNER JOIN
sales_executive as s1
on s.sales_executive_id = s1.sales_executive_id
GROUP BY s.sales_executive_id
ORDER BY No_of_Products_Sold desc;