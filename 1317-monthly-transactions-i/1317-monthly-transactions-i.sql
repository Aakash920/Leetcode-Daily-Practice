# Write your MySQL query statement below
Select DATE_FORMAT(trans_date, '%Y-%m') AS month, 
country, 
Count(trans_date) as trans_count,
SUM(IF(state='approved',1,0)) as approved_count,
Sum(amount) as trans_total_amount,
Sum(IF(state='approved', amount, 0)) as approved_total_amount
from Transactions

Group by country, month;