use everymemo;

drop table if exists folder;

CREATE TABLE IF NOT EXISTS folder(
  no int PRIMARY KEY auto_increment,
  id VARCHAR(20) NOT NULL,
  name VARCHAR(50) NOT NULL,
  date TIMESTAMP,
  cover VARCHAR(50) NOT NULL,
  shared_folder int NOT NULL,
  folder_link VARCHAR(36) NULL,
  order_folder int NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

desc folder;

select * from member;