/* 11. Daily New User Count
   Find the number of users who registered
   each day in the last 7 days. */

USE event_management;

SELECT

    registration_date,
    COUNT(user_id)
    AS total_users

FROM Users

WHERE registration_date >=
CURDATE() - INTERVAL 7 DAY

GROUP BY registration_date

ORDER BY registration_date;