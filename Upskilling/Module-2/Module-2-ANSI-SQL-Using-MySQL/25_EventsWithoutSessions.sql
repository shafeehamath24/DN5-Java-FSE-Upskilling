/* 25. Events Without Sessions
   List all events without
   scheduled sessions. */

USE event_management;

SELECT

    e.event_id,
    e.title

FROM Events e

LEFT JOIN Sessions s
    ON e.event_id = s.event_id

WHERE s.session_id IS NULL;