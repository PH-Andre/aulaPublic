create schema agenda;


CREATE TABLE agenda.contatos (

	id INT auto_increment NOT NULL,

	nome varchar(100) NULL,

	email varchar(100) NULL,

	endereco varchar(100) NULL,

	CONSTRAINT NewTable_PK PRIMARY KEY (id)

)

ENGINE=InnoDB

DEFAULT CHARSET=utf8mb4

COLLATE=utf8mb4_0900_ai_ci;





INSERT INTO agenda.contatos VALUES (1,'Annabel','afranzke0@vistaprint.com','69 Declaration Trail'),(2,'Frederigo','fnorquay1@list-manage.com','1727 Village Plaza'),(3,'Tybalt','tbanbrigge2@shutterfly.com','79 Ridgeway Circle'),(4,'Leda','lstrathern3@cnbc.com','39 Goodland Crossing'),(5,'Caressa','cmccorkindale4@google.fr','31 Golden Leaf Pass'),(6,'Arlee','adewitt5@spotify.com','84 Linden Alley'),(7,'Jaimie','jhaggerwood6@linkedin.com','5847 Pleasure Way'),(8,'Bunnie','bpetasch7@cnet.com','368 Northridge Center'),(9,'Myrtia','mtante8@nba.com','364 Oriole Avenue'),(10,'Fairfax','fheare9@quantcast.com','3017 Artisan Plaza');

select *
from agenda.contatos;