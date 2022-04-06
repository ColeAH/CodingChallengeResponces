SELECT
    (months * salary) AS totalSalary,
    COUNT(*)
FROM Employee
GROUP BY 1
ORDER BY totalSalary DESC
LIMIT 1;