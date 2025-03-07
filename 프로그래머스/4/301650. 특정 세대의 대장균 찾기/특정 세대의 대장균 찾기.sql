WITH RECURSIVE hierarchy AS (
    SELECT
        ID, PARENT_ID, 1 AS generation
    FROM
        ECOLI_DATA
    WHERE
        PARENT_ID IS NULL
    
    UNION ALL
    
    SELECT
        e.ID, e.PARENT_ID, h.generation + 1
    FROM
        ECOLI_DATA e JOIN hierarchy h ON e.PARENT_ID = h.ID
    WHERE
        h.generation < 3
)
SELECT
    ID
FROM
    hierarchy
WHERE
    generation = 3
ORDER BY
    ID;