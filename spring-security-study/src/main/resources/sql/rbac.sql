CREATE TABLE `admin_users`
(
    `id`            int(11)     NOT NULL AUTO_INCREMENT COMMENT '自增ID',
    `root`          tinyint(1)  NOT NULL DEFAULT '0' COMMENT '0-非超级管理员；1-超级管理；',
    `name`          varchar(32) NOT NULL DEFAULT '0' COMMENT '名称',
    `account`       varchar(32) NOT NULL DEFAULT '' COMMENT '账号',
    `password`      varchar(32) NOT NULL COMMENT '密码',
    `salt`          varchar(8)  NOT NULL DEFAULT '' COMMENT '密码盐',
    `create_time`   int(10)     NOT NULL COMMENT '创建时间',
    `update_time`   int(10)     NOT NULL COMMENT '修改时间',
    `login_time`    int(10)              DEFAULT NULL COMMENT '最后登录时间',
    `login_ip`      varchar(15)          DEFAULT '' COMMENT '最后登录ip',
    `disable`       tinyint(1)  NOT NULL DEFAULT '0' COMMENT '是否禁用：0-否；1-是；',
    `delete_time`   int(11)     NOT NULL DEFAULT '0' COMMENT '0为非删除状态，非0位删除时间',
    `login_address` varchar(255)         DEFAULT NULL COMMENT '登录详细地址',
    `role_id`       int(11)     NOT NULL DEFAULT '0' COMMENT '角色ID',
    PRIMARY KEY (`id`) USING BTREE
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = DYNAMIC COMMENT ='后台管理员表';


CREATE TABLE `roles`
(
    `id`          int(11)     NOT NULL AUTO_INCREMENT COMMENT '自增ID',
    `name`        varchar(25) NOT NULL COMMENT '角色名称',
    `auth_ids`    text COMMENT '权限ID',
    `desc`        varchar(255)         DEFAULT NULL COMMENT '描述',
    `sort`        smallint(6) NOT NULL DEFAULT '50' COMMENT '排序',
    `status`      tinyint(1)  NOT NULL DEFAULT '0' COMMENT '显隐：0：显示；1：隐藏',
    `create_time` int(10)              DEFAULT NULL COMMENT '创建时间',
    `update_time` int(10)              DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='角色表';


CREATE TABLE `menu_nodes`
(
    `id`          int(4) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '自增ID',
    `pid`         int(4)                   NOT NULL DEFAULT '0' COMMENT '父级ID',
    `name`        varchar(50)              NOT NULL COMMENT '名称',
    `icon`        varchar(50)                       DEFAULT NULL COMMENT '图标',
    `url`         varchar(255)             NOT NULL DEFAULT '' COMMENT '路由规则',
    `type`        tinyint(1)               NOT NULL DEFAULT '1' COMMENT '类型：\r\n1：菜单\r\n2：按钮',
    `sort`        int(4)                            DEFAULT '50' COMMENT '排序',
    `create_time` int(10)                           DEFAULT NULL COMMENT '创建时间',
    `update_time` int(10)                           DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='菜单节点表';

CREATE TABLE `role_menu_nodes`
(
    `role_id` int(11) NOT NULL COMMENT '角色ID',
    `node_id` int(11) NOT NULL COMMENT '权限ID',
    PRIMARY KEY (`role_id`, `node_id`) USING BTREE
) DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci COMMENT ='角色权限关系表';