drop table users;
drop table cities;

create table cities(
  city_id serial8 not null,
  city_name varchar not null,
  index int4 not null,
  primary key(city_id)
);

create table users(
  user_id serial8 not null,
  login varchar unique not null,
  name varchar not null,
  city int8 not null references cities(city_id),
  primary key (user_id)
);

insert into cities(city_name, index)
values ('Astana', 010000),
       ('Almaty', 050000);

insert into users(login, city, name)
values ('riotname232', 1, 'Mark'),
       ('devmagican', 2, 'Talgat');
