CREATE SCHEMA `userdb` ;

USE userdb;

DROP TABLE IF EXISTS image_data;  
CREATE TABLE image_data (  
id INT AUTO_INCREMENT PRIMARY KEY,  
name VARCHAR(50) NOT NULL,  
image_type VARCHAR(50) NOT NULL,
data BLOB NOT NULL
);  

select * from image_data;