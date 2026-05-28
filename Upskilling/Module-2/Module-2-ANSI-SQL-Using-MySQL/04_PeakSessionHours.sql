/* 04. Peak Session Hours
   Count how many sessions are scheduled
   between 10 AM and 12 PM for each event. */

USE event_management;

CREATE TABLE Sessions (

    session_id INT PRIMARY KEY AUTO_INCREMENT,
    event_id INT,
    session_title VARCHAR(200),
    speaker_name VARCHAR(100),
    start_time DATETIME,
    end_time DATETIME

);

INSERT INTO Sessions
(event_id,
 session_title,
 speaker_name,
 start_time,
 end_time)
VALUES

(1,
'AI Introduction',
'John Doe',
'2025-06-10 10:00:00',
'2025-06-10 11:00:00'),

(1,
'Cloud Computing',
'Jane Smith',
'2025-06-10 11:30:00',
'2025-06-10 12:00:00'),

(2,
'Machine Learning',
'Robert Brown',
'2025-05-15 09:00:00',
'2025-05-15 10:30:00');

SELECT

    e.event_id,
    e.title,
    COUNT(s.session_id) AS peak_session_count

FROM Events e

JOIN Sessions s
    ON e.event_id = s.event_id

WHERE TIME(s.start_time)
BETWEEN '10:00:00' AND '12:00:00'

GROUP BY
    e.event_id,
    e.title;