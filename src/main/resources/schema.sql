DROP TABLE if EXISTS movie CASCADE;

create table movie
(
    id serial constraint movie_pk primary key,
    name varchar not null,
    year integer not null
);
insert into movie (id, name, year) values (1, 'Avatar', 2009);
insert into movie (id, name, year) values (2, '2012', 2009);
insert into movie (id, name, year) values (3, 'Россия', 146030881);
insert into movie (id, name, year) values (4, 'Германия', 83349300);
insert into movie (id, name, year) values (5, 'Франция', 68959599);
insert into movie (id, name, year) values (6, 'Италия', 59236213);