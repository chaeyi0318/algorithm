WITH SALES AS (
    SELECT 
        BS.BOOK_ID,SUM(BS.SALES * B.PRICE) AS TOTAL_SALES
    FROM
        BOOK_SALES BS JOIN BOOK B ON BS.BOOK_ID = B.BOOK_ID
    WHERE 
        SALES_DATE LIKE '2022-01-%'
    GROUP BY
        BS.BOOK_ID
)

SELECT 
    A.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(S.TOTAL_SALES) AS TOTAL_SALES
FROM 
    SALES S 
    JOIN BOOK B ON S.BOOK_ID = B.BOOK_ID
    JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
GROUP BY 
    A.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY
ORDER BY 
    A.AUTHOR_ID ASC, B.CATEGORY DESC;
