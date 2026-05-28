/* 09. Organizer Event Summary
   Show number of events created
   by each organizer and status. */

USE event_management;

SELECT

    organizer_id,
    status,
    COUNT(event_id)
    AS total_events

FROM Events

GROUP BY
    organizer_id,
    status;