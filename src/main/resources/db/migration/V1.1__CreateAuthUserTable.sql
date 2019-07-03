create table auth_user (
  auth_user_id int(11) not null primary key auto_increment,
  email varchar(255) not null unique,
  hashed_password varchar(255) not null,
  updated_time timestamp not null default current_timestamp,
  created_time timestamp not null default current_timestamp
)
