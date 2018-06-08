INSERT INTO users (username, password) VALUES
	('TestUser1', 'pa55word'),
	('TestUser2', '12345'),
	('TestUser3', 'secure');
    
INSERT INTO messages (sender, payload) VALUES
	('TestUser1', 'Hello World'),
	('TestUser2', 'Hello to you too'),
	('TestUser3', 'neither of you are the world');
	
INSERT INTO user_roles (username, role) VALUES 
	('TestUser1', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES
	('TestUser2', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES
	('TestUser3', 'ROLE_USER');