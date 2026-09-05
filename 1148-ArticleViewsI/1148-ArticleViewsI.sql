-- Last updated: 9/5/2026, 12:31:35 PM
# Write your MySQL query statement below
SELECT DISTINCT(author_id) AS id FROM VIEWS WHERE AUTHOR_ID = VIEWER_ID ORDER BY AUTHOR_ID ASC;