DROP DATABASE IF EXISTS sample;
DROP USER IF EXISTS student;
CREATE USER student@localhost;
SET PASSWORD FOR student = 'himitu';
CREATE DATABASE sample;
GRANT ALL ON sample.* to student;
DROP TABLE IF EXISTS emp;
USE sample;
CREATE TABLE emp (
    code INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER,
    tel TEXT
);

INSERT INTO emp VALUES(1, '鈴木', 30, '03-1111-1111');
INSERT INTO emp VALUES(2, '山田', 29, '03-2222-2222');
INSERT INTO emp VALUES(3, '田中', 24, '03-3333-3333');
INSERT INTO emp VALUES(4, 'ロバート', 60, '03-4444-4444');
INSERT INTO emp VALUES(5, '西園寺', 12, '03-5555-5555');

# ALTER TABLE emp OWNER TO student;