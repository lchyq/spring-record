CREATE table user(id int not null primary key,
bir1 TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP,
bir2 datetime not null DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP);