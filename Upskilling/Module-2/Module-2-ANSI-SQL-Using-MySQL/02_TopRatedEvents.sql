/* 02. Top Rated Events
   Identify events with the highest average rating,
   considering only those that have received at least
   10 feedback submissions. */

CREATE DATABASE event_management;

USE event_management;

CREATE TABLE Users (

    user_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    city VARCHAR(100) NOT NULL,
    registration_date DATE NOT NULL

);

CREATE TABLE Events (

    event_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    description TEXT,
    city VARCHAR(100) NOT NULL,
    start_date DATETIME NOT NULL,
    end_date DATETIME NOT NULL,
    status ENUM('upcoming', 'completed', 'cancelled'),
    organizer_id INT

);

CREATE TABLE Feedback (

    feedback_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    event_id INT,
    rating INT CHECK (rating BETWEEN 1 AND 5),
    comments TEXT,
    feedback_date DATE NOT NULL

);

INSERT INTO Users
(full_name, email, city, registration_date)
VALUES

('Alice Johnson',
 'alice@example.com',
 'New York',
 '2024-12-01'),

('Bob Smith',
 'bob@example.com',
 'Los Angeles',
 '2024-12-05'),

('Charlie Lee',
 'charlie@example.com',
 'Chicago',
 '2024-12-10'),

('Diana King',
 'diana@example.com',
 'New York',
 '2025-01-15'),

('Ethan Hunt',
 'ethan@example.com',
 'Los Angeles',
 '2025-02-01');

INSERT INTO Events
(title,
 description,
 city,
 start_date,
 end_date,
 status,
 organizer_id)
VALUES

(
'Tech Innovators Meetup',
'A meetup for tech enthusiasts.',
'New York',
'2025-06-10 10:00:00',
'2025-06-10 16:00:00',
'upcoming',
1
),

(
'AI & ML Conference',
'Conference on AI and ML advancements.',
'Chicago',
'2025-05-15 09:00:00',
'2025-05-15 17:00:00',
'completed',
3
),

(
'Frontend Development Bootcamp',
'Hands-on training on frontend tech.',
'Los Angeles',
'2025-07-01 10:00:00',
'2025-07-03 16:00:00',
'upcoming',
2
);

INSERT INTO Feedback
(user_id,
 event_id,
 rating,
 comments,
 feedback_date)
VALUES

(1, 2, 5, 'Excellent Event!', '2025-05-16'),
(2, 2, 4, 'Very informative.', '2025-05-16'),
(3, 2, 5, 'Loved the sessions.', '2025-05-16'),
(4, 2, 4, 'Great organization.', '2025-05-16'),
(5, 2, 5, 'Amazing experience.', '2025-05-16'),

(1, 1, 3, 'Good event.', '2025-06-11'),
(2, 1, 2, 'Could improve.', '2025-06-11'),
(3, 1, 3, 'Average event.', '2025-06-11'),
(4, 1, 4, 'Nice meetup.', '2025-06-11'),
(5, 1, 3, 'Informative.', '2025-06-11'),

(1, 2, 5, 'Excellent!', '2025-05-17'),
(2, 2, 5, 'Fantastic.', '2025-05-17');

SELECT

    e.event_id,
    e.title,
    ROUND(AVG(f.rating), 2) AS average_rating,
    COUNT(f.feedback_id) AS total_feedbacks

FROM Events e

JOIN Feedback f
    ON e.event_id = f.event_id

GROUP BY
    e.event_id,
    e.title

HAVING COUNT(f.feedback_id) >= 10

ORDER BY average_rating DESC;