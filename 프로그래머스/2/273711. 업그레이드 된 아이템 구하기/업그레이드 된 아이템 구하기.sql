SELECT 
    T.ITEM_ID, I.ITEM_NAME, RARITY
FROM 
    ITEM_TREE T JOIN ITEM_INFO I ON T.ITEM_ID = I.ITEM_ID
WHERE T.PARENT_ITEM_ID IN (
    SELECT
        ITEM_ID
    FROM 
            ITEM_INFO
    WHERE 
        RARITY = 'RARE')
ORDER BY
    ITEM_ID DESC;