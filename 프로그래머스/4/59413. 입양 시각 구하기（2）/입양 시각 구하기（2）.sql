WITH RECURSIVE Hours AS (
    SELECT
        0 AS Hour
    UNION ALL
    SELECT 
        Hour + 1
    FROM
        Hours
    WHERE 
        Hour < 23
)

SELECT
    H.Hour AS HOUR,
    COALESCE(COUNT(A.DATETIME), 0) AS COUNT
FROM 
    Hours H LEFT JOIN ANIMAL_OUTS A ON H.Hour = HOUR(A.DATETIME)
GROUP BY
    H.Hour
ORDER BY
    H.Hour;