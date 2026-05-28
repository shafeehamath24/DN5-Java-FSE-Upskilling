/* 06. Event Resource Summary
   Generate a report showing the number of
   resources uploaded for each event. */

USE event_management;

CREATE TABLE Resources (

    resource_id INT PRIMARY KEY AUTO_INCREMENT,
    event_id INT,
    resource_type VARCHAR(50),
    resource_link VARCHAR(255)

);

INSERT INTO Resources
(event_id,
 resource_type,
 resource_link)
VALUES

(1,
'PDF',
'https://example.com/agenda.pdf'),

(1,
'Image',
'https://example.com/banner.jpg'),

(2,
'Link',
'https://example.com/resources');

SELECT

    e.event_id,
    e.title,
    COUNT(r.resource_id)
    AS total_resources

FROM Events e

LEFT JOIN Resources r
    ON e.event_id = r.event_id

GROUP BY
    e.event_id,
    e.title;