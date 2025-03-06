WITH FISH_DATA AS (
    SELECT 
        ID, FISH_TYPE, LENGTH
    FROM 
        FISH_INFO
    WHERE 
        (FISH_TYPE, LENGTH) IN (
            SELECT 
                FISH_TYPE, MAX(LENGTH)
            FROM 
                FISH_INFO
            GROUP BY 
                FISH_TYPE
        )
    )

SELECT 
    ID, FISH_NAME, LENGTH
FROM 
    FISH_NAME_INFO N JOIN FISH_DATA D ON N.FISH_TYPE = D.FISH_TYPE