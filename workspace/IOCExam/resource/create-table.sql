 create table users(
 id varchar2(10) primary key,
  name varchar2(15) not null,
  password varchar2(15) not null,
 email varchar2(50),
 join_date date);
 
 
 
 insert into users values('carami','강경미','1234','carami@nate.com',sysdate);