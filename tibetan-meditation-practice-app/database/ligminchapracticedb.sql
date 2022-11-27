--this is a template to work from
BEGIN TRANSACTION;

DROP TABLE IF EXISTS practice_lineage;
DROP TABLE IF EXISTS lineage;
DROP TABLE IF EXISTS practice;

CREATE TABLE lineage (
  lineage_id serial,
  lineage_name varchar(50) NOT NULL,   -- eg. Zhang Zhung Nyen Gyu

  constraint pk_lineage_id primary key(lineage_id)
);

create table practice (
practice_id serial,
practice_name varchar(100) not null unique,
instructions varchar(1000),
prayer varchar(1000),
support_img varchar(100), --jpeg filepath?
practice_audio varchar(100), --mp3 filepath?

constraint pk_practice_id primary key(practice_id)
);

create table practice_lineage ( --join table
practice_id int,
lineage_id int,

constraint fk_practice_id foreign key(practice_id) references practice(practice_id),
constraint fk_lineage_id foreign key(lineage_id) references lineage(lineage_id)
);

insert into lineage(lineage_name)
values('Ma Gyu');

insert into lineage(lineage_name)
values('A Tri');

insert into lineage(lineage_name)
values('Zhang Zhung Nyen Gyu');

insert into lineage(lineage_name)
values('Miscellaneous');


COMMIT TRANSACTION;
