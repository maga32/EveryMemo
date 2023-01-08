use everymemo;

drop table if exists member;

CREATE TABLE IF NOT EXISTS member(
  id VARCHAR(20) PRIMARY KEY,
  password VARCHAR(60) NOT NULL,
  nickname VARCHAR(10) NOT NULL,
  photo VARCHAR(100) NULL,
  email VARCHAR(40) NOT NULL,
  join_date TIMESTAMP NOT NULL,
  del_date TIMESTAMP NULL,
  pro_date TIMESTAMP NULL,
  punish_date TIMESTAMP NULL,
  level VARCHAR(2) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

desc member;

select * from member;