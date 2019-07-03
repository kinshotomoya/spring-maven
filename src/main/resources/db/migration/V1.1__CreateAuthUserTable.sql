create table auth_user (
  auth_user_id int(11) not null auto_increment,
  email varchar(255) not null unique,
  hashed_password varchar(255) not null,
  updated_time timestamp not null default current_timestamp,
  created_time timestamp not null default current_timestamp,
  primary key (auth_user_id)
)
