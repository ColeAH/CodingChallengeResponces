SELECT 
    CEIL(AVG(Employees.Salary) - AVG(REPLACE(Employees.Salary,0,'')))
FROM Employees;