use everymemo;

drop table if exists memo_modify;

CREATE TABLE IF NOT EXISTS memo_modify(
  no int PRIMARY KEY auto_increment,
  memo_no int NOT NULL,
  id VARCHAR(20) NOT NULL,
  mo_content VARCHAR(10000) NOT NULL,
  mo_date TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

desc memo_modify;

select * from memo_modify;