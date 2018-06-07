CREATE TABLE users (
    username       VARCHAR(20)                     PRIMARY KEY);
    
CREATE TABLE messages (
    message_id      BIGINT UNSIGNED AUTO_INCREMENT  PRIMARY KEY,
    sender          VARCHAR(20),
    payload    VARCHAR(255));