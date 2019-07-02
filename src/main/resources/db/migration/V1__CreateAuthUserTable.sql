create table auth_user (
  id serial primary key,
  email varchar(255) not null unique,
  hashpassword integer not null default 0,
  updated_time timestamp not null default current_timestamp,
  created_time timestamp not null default current_timestamp
)
