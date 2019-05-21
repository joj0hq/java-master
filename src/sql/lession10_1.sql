DROP DATABASE IF EXISTS sample;
DROP USER IF EXISTS student;
CREATE USER student@localhost;
SET PASSWORD FOR student = 'himitu';
CREATE DATABASE sample;
GRANT ALL ON sample.* to student;
DROP TABLE IF EXISTS employee;
USE sample;
CREATE TABLE employee (
    code INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER,
    tel TEXT
);

INSERT INTO employee VALUES (1, '鈴木', 30, '03-1111-1111'),
                            (2, '山田', 29, '03-2222-2222'),
                            (3, '田中', 24, '03-3333-3333'),
                            (4, 'ロバート', 60, '03-4444-4444'),
                            (5, '西園寺', 12, '03-5555-5555');
