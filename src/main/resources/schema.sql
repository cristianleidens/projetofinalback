DROP TABLE IF EXISTS client;

CREATE TABLE client (
		 id_client BIGINT AUTO_INCREMENT NOT NULL,
		 name VARCHAR(255) NULL,
		 age INT NULL,
		 PRIMARY KEY (id_client));
