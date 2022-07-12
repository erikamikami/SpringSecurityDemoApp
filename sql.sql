DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id serial PRIMARY KEY
    ,name VARCHAR(20) NOT NULL
    ,password VARCHAR(35) NOT NULL
    ,attribute_id VARCHAR(10) NOT NULL
);

DROP TABLE IF EXISTS attributes;

CREATE TABLE attributes (
    id serial PRIMARY KEY
    ,attribute VARCHAR(20) NOT NULL
);

INSERT INTO attributes (id, attribute) VALUES (1, '管理者');
INSERT INTO attributes (id, attribute) VALUES (2, '一般');
INSERT INTO attributes (id, attribute) VALUES (3, '閲覧者');