-- Last updated: 8/12/2026, 11:11:38 AM
# Write your MySQL query statement below
SELECT DISTINCT(author_id) AS id FROM VIEWS WHERE AUTHOR_ID = VIEWER_ID ORDER BY AUTHOR_ID ASC;