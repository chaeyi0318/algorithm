SELECT 
    COUNT(*) AS 'FISH_COUNT', N.FISH_NAME
FROM
    FISH_INFO F JOIN FISH_NAME_INFO N ON F.FISH_TYPE = N.FISH_TYPE
GROUP BY 
    N.FISH_NAME
ORDER BY
    FISH_COUNT DESC;