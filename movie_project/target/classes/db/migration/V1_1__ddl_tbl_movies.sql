CREATE table movie(
    id integer primary key ,
    movie_name varchar(100),
    description varchar(255)
);

CREATE SEQUENCE movie_seq MINVALUE 1 START 1 INCREMENT 1 MAXVALUE 9223372036854775807;

