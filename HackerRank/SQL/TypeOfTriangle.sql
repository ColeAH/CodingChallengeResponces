SELECT
    CASE
        WHEN (A+B) > C AND (A+C) > B AND (B+C) > A THEN 
            CASE
                WHEN A = B AND A = C THEN 'Equilateral'
                WHEN A = B THEN 'Isosceles'
                WHEN A = C THEN 'Isosceles'
                WHEN B = C THEN 'Isosceles'
                ELSE 'Scalene'
            END
        ELSE 'Not A Triangle'
    END
FROM TRIANGLES;