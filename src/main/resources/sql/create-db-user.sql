CREATE USER 'user1'@'localhost' IDENTIFIED BY 'password1';
GRANT ALL PRIVILEGES ON *.* TO 'user1'@localhost IDENTIFIED BY 'password1';
GRANT ALL PRIVILEGES ON restaurant_booking.* TO 'user1'@localhost;
FLUSH PRIVILEGES;
