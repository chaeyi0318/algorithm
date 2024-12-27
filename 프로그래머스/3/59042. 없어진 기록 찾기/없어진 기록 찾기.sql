SELECT 
    O.ANIMAL_ID, O.NAME
FROM
    ANIMAL_OUTS O
WHERE
    O.ANIMAL_ID NOT IN (
        SELECT
            I.ANIMAL_ID
        FROM 
            ANIMAL_INS I
    )
GROUP BY
    O.ANIMAL_ID;