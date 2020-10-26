drop table if exists USERS;
drop table if exists country;
drop table if exists inventory;

create table USERS(
  ID int not null AUTO_INCREMENT,
  NAME varchar(100) not null,
  STATUS int,
  PRIMARY KEY ( ID )
);

CREATE TABLE country (
  id   INTEGER      NOT NULL AUTO_INCREMENT,
  name VARCHAR(128) NOT NULL,
  PRIMARY KEY (id)
);


CREATE TABLE inventory (
  id   			INTEGER      NOT NULL AUTO_INCREMENT,
  code 			VARCHAR(128) NOT NULL,
  name 			VARCHAR(128) NOT NULL,
  desc 			VARCHAR(128) NOT NULL,
  unit_price 		FLOAT,
  qty_in_stock 		FLOAT,
  reorder_level 	FLOAT,
  reorder_time_in_days 	FLOAT,
  reorder_qty   	FLOAT,
  discontinued  	BOOL,
  PRIMARY KEY (id)
);