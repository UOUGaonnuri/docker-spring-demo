CREATE TABLE `test_entity`
(
    `entity_id` bigint NOT NULL AUTO_INCREMENT,
    `user_name` VARCHAR(20) NOT NULL,
    `user_role` VARCHAR(20) NOT NULL,
    PRIMARY KEY (`entity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
