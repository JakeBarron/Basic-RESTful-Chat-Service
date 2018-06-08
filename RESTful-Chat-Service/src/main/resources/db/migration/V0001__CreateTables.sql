CREATE TABLE users (
    username		VARCHAR(20)                     PRIMARY KEY);
    password		VARCHAR(20));
    
CREATE TABLE messages (
    message_id      BIGINT UNSIGNED AUTO_INCREMENT  PRIMARY KEY,
    sender          VARCHAR(20),
    payload    VARCHAR(255));
    

CREATE TABLE user_roles (
	user_role_id int(11) NOT NULL AUTO_INCREMENT,
	username varchar(20) NOT NULL,
	role varchar(20) NOT NULL,
	PRIMARY KEY (user_role_id),
	UNIQUE KEY uni_username_role (role,username),
	KEY fk_username_idx (username),
	CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));