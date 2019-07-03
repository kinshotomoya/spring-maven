create table user (
  user_id int(11) not null primary key auto_increment,
  nickname varchar(255) not null,
  updated_time timestamp not null default current_timestamp,
  created_time timestamp not null default current_timestamp
)
