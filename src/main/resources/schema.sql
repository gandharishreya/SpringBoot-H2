create table if not exists photo(
       id bigint AUTO_INCREMENT primary key,
       file_name varchar(255),
       content_type varchar(255),
       data blob
);