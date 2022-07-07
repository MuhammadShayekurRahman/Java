drop table if exists car CASCADE;
create table car (
id integer UNIQUE auto_increment PRIMARY KEY, 
electric boolean default false, 
make varchar(255) not null, 
model varchar(255), 
`type` varchar(255) 
);