drop user 'sqluser'@'localhost';
create user 'sqluser'@'localhost' identified by 'sqlpwd';
grant all privileges on School.* to 'sqluser'@'localhost';
flush privileges;