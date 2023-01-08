use everymemo;

drop table if exists memo_list;

CREATE TABLE IF NOT EXISTS memo_list(
  no int PRIMARY KEY auto_increment,
  id VARCHAR(20) NOT NULL,
  folder_no int NOT NULL,
  preview VARCHAR(40) NULL,
  thumbnail VARCHAR(100) NULL,
  write_date TIMESTAMP NOT NULL,
  edit_date TIMESTAMP NULL,
  del_date TIMESTAMP NULL,
  fixed int NOT NULL,
  shared_memo int NOT NULL,
  memo_link VARCHAR(36) NULL,
  readonly int NOT NULL,
  favorite int NOT NULL,
  locked int NOT NULL,
  password VARCHAR(60) NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

desc memo_list;

select * from memo_list;