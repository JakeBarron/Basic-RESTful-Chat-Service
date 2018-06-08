INSERT INTO users (username) VALUES
	('TestUser1'),
	('TestUser2'),
	('TestUser3');
    
INSERT INTO messages (sender, payload) VALUES
	('TestUser1', 'Hello World'),
	('TestUser2', 'Hello to you too'),
	('TestUser3', 'neither of you are the world');
	
SCRIPT TO './MySqlDump.txt'