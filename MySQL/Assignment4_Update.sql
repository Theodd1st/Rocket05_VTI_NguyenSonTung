USE classicmodels;

SELECT * FROM payments;
SELECT * FROM products
ORDER BY productName;
SELECT * FROM orders
ORDER BY orderNumber;
SELECT * FROM orderdetails
ORDER BY orderNumber;

SELECT SUM(od.quantityOrdered*od.priceEach) AS TongGiaTri
FROM orderdetails od
JOIN orders o
ON o.orderNumber = od.orderNumber
WHERE o.`status` = 'shipped' AND MONTH(o.shippedDate) = 8 AND YEAR(o.shippedDate) = 2004;

SELECT c.customerName,c.customerNumber,SUM(p.amount)-SUM(od.quantityOrdered*od.priceEach) AS profit
FROM customers c
LEFT JOIN payments p
ON c.customerNumber = p.customerNumber
LEFT JOIN orders o
ON p.customerNumber = o.customerNumber
LEFT JOIN orderdetails od
ON o.orderNumber = od.orderNumber
GROUP BY c.customerNumber
ORDER BY SUM(p.amount)-SUM(od.quantityOrdered*od.priceEach) DESC;

SELECT pr.productCode,pr.productName,SUM(p.amount) AS DoanhThu
FROM products pr
LEFT JOIN orderdetails od
ON pr.productCode = od.productCode
LEFT JOIN orders o
ON od.orderNumber = o.orderNumber
LEFT JOIN payments p
ON o.customerNumber = p.customerNumber
GROUP BY pr.productCode
ORDER BY SUM(p.amount) DESC;