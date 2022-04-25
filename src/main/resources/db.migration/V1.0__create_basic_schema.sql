-- create role table
CREATE TABLE IF NOT EXISTS `user_role` (
                                           id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                           user_role varchar(20) NOT NULL,
                                           created_at timestamp,
                                           updated_at timestamp
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;


-- create user table
CREATE TABLE IF NOT EXISTS `user`(
    id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    roleId int(11) NOT NULL,
    username varchar(50) NOT NULL UNIQUE,
    password varchar(80) NOT NULL,
    email varchar(50) NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    CONSTRAINT fk_user_role_user FOREIGN KEY(roleId) REFERENCES `user_role`(id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;


-- create table order
CREATE TABLE IF NOT EXISTS `order` (
    id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id int(11) NOT NULL,
    order_date date NOT NULL,
    created_at timestamp ,
    updated_at timestamp,
    CONSTRAINT fk_order_user FOREIGN KEY(user_id) REFERENCES `user`(id)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;

-- create table products
CREATE TABLE IF NOT EXISTS `product` (
    id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(50) NOT NULL,
    descriptions varchar(200) NOT NULL,
    quantity_on_hand int(4) NOT NULL,
    created_at timestamp,
    updated_at timestamp
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;

-- create table order detail
CREATE TABLE IF NOT EXISTS `order_detail` (
    product_id int(11) NOT NULL,
    order_id int(11) NOT NULL,
    quantity int(4) NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    CONSTRAINT PRIMARY KEY (order_id, product_id),
    CONSTRAINT fk_order_detail_order FOREIGN KEY(order_id) REFERENCES `order`(id),
    CONSTRAINT fk_order_detail_product FOREIGN KEY(product_id) REFERENCES `product`(id)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
