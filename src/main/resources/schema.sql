DROP TABLE IF EXISTS mysql_table;
CREATE TABLE `mysql_table`
(
    `id`           BIGINT(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `code`         VARCHAR(64) NOT NULL COMMENT '编码',
    `name`         VARCHAR(64) NOT NULL COMMENT '名称',
    `comment`      VARCHAR(64) COMMENT '备注',
    `created_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    unique KEY `idx_code` (`code`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='mysql测试表';
