-- src/main/resources/schema.sql

DROP TABLE IF EXISTS "promotion";
DROP TABLE IF EXISTS "ad";
DROP TABLE IF EXISTS "post";
DROP TABLE IF EXISTS "user" CASCADE;

CREATE TABLE "user" (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255),
    bio VARCHAR(255),
    contact_options VARCHAR(255),
    links VARCHAR(255),
    followers INT,
    following INT,
    account_reached INT,
    account_engaged INT,
    total_stories INT,
    total_follows INT,
    total_posts INT,
    total_saves INT,
    total_comments INT,
    total_shares INT
);

CREATE TABLE "post" (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    content VARCHAR(255),
    created_at TIMESTAMP,
    likes INT,
    comments INT,
    shares INT,
    FOREIGN KEY (user_id) REFERENCES "user"(id)
);

CREATE TABLE "ad" (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    content VARCHAR(255),
    created_at TIMESTAMP,
    insights INT,
    FOREIGN KEY (user_id) REFERENCES "user"(id)
);

CREATE TABLE "promotion" (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT,
    content VARCHAR(255),
    created_at TIMESTAMP,
    active BOOLEAN,
    FOREIGN KEY (user_id) REFERENCES "user"(id)
);
