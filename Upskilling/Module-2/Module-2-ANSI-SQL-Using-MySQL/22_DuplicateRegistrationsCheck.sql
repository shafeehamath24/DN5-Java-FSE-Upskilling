/* 22. Duplicate Registrations Check
   Detect users registered more than
   once for the same event. */

USE event_management;

SELECT

    user_id,
    event_id,

    COUNT(registration_id)
    AS duplicate_count

FROM Registrations

GROUP BY
    user_id,
    event_id

HAVING COUNT(registration_id) > 1;