WITH ReviewCounts AS (
    SELECT 
        MEMBER_ID,
        COUNT(*) AS REVIEW_COUNT
    FROM
        REST_REVIEW
    GROUP BY
        MEMBER_ID
),
TopReviewer AS (
    SELECT 
        MEMBER_ID
    FROM
        ReviewCounts
    WHERE
        REVIEW_COUNT = (SELECT MAX(REVIEW_COUNT) FROM ReviewCounts)
)
SELECT 
    MP.MEMBER_NAME,
    RR.REVIEW_TEXT,
    DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM
    REST_REVIEW RR
JOIN MEMBER_PROFILE MP ON RR.MEMBER_ID = MP.MEMBER_ID
WHERE
    RR.MEMBER_ID = (
        SELECT
            MEMBER_ID
        FROM
            TopReviewer
        LIMIT 1
        )
ORDER BY
    RR.REVIEW_DATE ASC, RR.REVIEW_TEXT ASC;
