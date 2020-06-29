DROP TABLE IF EXISTS client;

CREATE TABLE client (
		 id_client BIGINT AUTO_INCREMENT NOT NULL,
		 name VARCHAR(255) NULL,
		 age INT NULL,
		 cpf VARCHAR(14) NULL,
		 email VARCHAR(255) NULL,
		 phone BIGINT(12) NULL,
		 save VARCHAR(255) NULL,
		 PRIMARY KEY (id_client));
