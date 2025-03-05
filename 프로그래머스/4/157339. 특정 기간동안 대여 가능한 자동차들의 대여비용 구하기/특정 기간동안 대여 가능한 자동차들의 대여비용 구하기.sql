WITH AVAILABLE_CARS AS (
    SELECT 
        CAR_ID
    FROM 
        CAR_RENTAL_COMPANY_CAR
    WHERE 
        CAR_TYPE IN ('세단', 'SUV')
    EXCEPT
    SELECT
        DISTINCT CAR_ID
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE
        START_DATE <= '2022-11-30' AND END_DATE >= '2022-11-01'
)

SELECT 
    C.CAR_ID, C.CAR_TYPE, FLOOR(C.DAILY_FEE * 30 * (1 - D.DISCOUNT_RATE / 100)) AS FEE
FROM 
    CAR_RENTAL_COMPANY_CAR C
JOIN 
    CAR_RENTAL_COMPANY_DISCOUNT_PLAN D ON C.CAR_TYPE = D.CAR_TYPE
JOIN 
    AVAILABLE_CARS A ON C.CAR_ID = A.CAR_ID
WHERE 
    D.DURATION_TYPE = '30일 이상'
    AND C.CAR_TYPE IN ('세단', 'SUV')
    AND (C.DAILY_FEE * 30 * (1 - D.DISCOUNT_RATE / 100)) BETWEEN 500000 AND 1999999
ORDER BY 
    FEE DESC, C.CAR_TYPE ASC, C.CAR_ID DESC