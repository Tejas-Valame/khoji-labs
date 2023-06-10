
# Run these commands as root on your database


CREATE DATABASE IF NOT EXISTS khojilabs_db;

CREATE USER IF NOT EXISTS 'web_app'@'%' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON tododb.* TO 'web_app'@'%'; 