create table user (
  user_id int(11) not null primary key auto_increment,
  nickname varchar(255) not null,
  auth_user_id int not null,
  updated_time timestamp not null default current_timestamp,
  created_time timestamp not null default current_timestamp,
  foreign key (auth_user_id) references auth_user (auth_user_id)
)
