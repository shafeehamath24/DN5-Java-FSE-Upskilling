/* 01. User Upcoming Events
   Show a list of all upcoming events a user is registered for in their city,
   sorted by date. */

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

CREATE TABLE Registrations (

    registration_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    event_id INT,
    registration_date DATE NOT NULL

);

INSERT INTO Users
(full_name, email, city, registration_date)
VALUES
('Alice Johnson', 'alice@example.com', 'New York', '2024-12-01'),
('Bob Smith', 'bob@example.com', 'Los Angeles', '2024-12-05'),
('Charlie Lee', 'charlie@example.com', 'Chicago', '2024-12-10');

INSERT INTO Events
(title, description, city, start_date, end_date, status, organizer_id)
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
'Conference on AI advancements.',
'Chicago',
'2025-05-15 09:00:00',
'2025-05-15 17:00:00',
'completed',
3
);

INSERT INTO Registrations
(user_id, event_id, registration_date)
VALUES
(1, 1, '2025-05-01'),
(2, 1, '2025-05-02'),
(3, 2, '2025-04-30');

SELECT 
    u.full_name,
    u.city AS user_city,
    e.title AS event_title,
    e.city AS event_city,
    e.start_date,
    e.status
FROM Users u
JOIN Registrations r
    ON u.user_id = r.user_id
JOIN Events e
    ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
AND u.city = e.city
ORDER BY e.start_date;