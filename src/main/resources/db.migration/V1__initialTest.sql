ALTER TABLE cardgame.user
MODIFY COLUMN `id` BIGINT NOT NULL AUTO_INCREMENT;

INSERT INTO cardgame.user (user_name, password, email, first_name, last_name, user_role) VALUES
('johndoe1', 'password1', 'johndoe1@example.com', 'John', 'Doe', 'Admin'),
('janedoe2', 'password2', 'janedoe2@example.com', 'Jane', 'Doe', 'Normal'),
('samsmith3', 'password3', 'samsmith3@example.com', 'Sam', 'Smith', 'Normal'),
('alicejohnson4', 'password4', 'alicejohnson4@example.com', 'Alice', 'Johnson', 'Normal'),
('bobwilliams5', 'password5', 'bobwilliams5@example.com', 'Bob', 'Williams', 'Normal');