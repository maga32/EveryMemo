use everymemo;

drop table if exists memo;

CREATE TABLE IF NOT EXISTS memo(
  no int PRIMARY KEY,
  content VARCHAR(10000) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

desc memo;

select * from member;