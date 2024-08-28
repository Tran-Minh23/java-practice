-- DROP TABLE IF EXISTS Author;  

-- CREATE TABLE Author ( 
--     id INT AUTO_INCREMENT PRIMARY KEY,  
--     firstName VARCHAR(50) NOT NULL
-- );

INSERT INTO Author (id, first_name) VALUES (1, 'Minh1');    
INSERT INTO Author (id, first_name) VALUES (2, 'Tram1');    
INSERT INTO Author (id, first_name) VALUES (3, 'Cc1');

INSERT INTO Book (title, author_id) VALUES ('Doima1', 1);    
INSERT INTO Book (title, author_id) VALUES ('Doima2', 1);    
INSERT INTO Book (title, author_id) VALUES ('DMCS1', 2);
INSERT INTO Book (title, author_id) VALUES ('DMCS2', 2);    
INSERT INTO Book (title, author_id) VALUES ('TPHCM1', 3);    
INSERT INTO Book (title, author_id) VALUES ('TPHCM2', 3);