# 使用 Spring JPA 访问 Mysql 中的数据

## 概述
Spring 中使用 JPA 来访问 Mysql 中的数据。

## 知识点
1. lombok 插件使用，减少 PO 对象的方法编写
2. 使用 Spring JPA 来访问 MySQL 中的数据
3. Docker 启动一个测试用的 MySQL

## Docker 启动 MySQL 并配置远程授权
在本地（Windows 10）简单启动一个测试用的 mysql 吧！~
```
## 启动
docker run --name hairless-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234567 -d mysql:8.0.20

## 进入
docker exec -ti xxx mysql -uroot -p1234567

-- 创建数据库
mysql> create database hairless;
mysql> use hairless;

-- 授权
mysql> create user 'hairless'@'%' identified by '1234567';
mysql> grant all privileges on *.* to 'hairless'@'%'；
mysql> flush privileges;
```

## 代码
下载 IDEA，即可直接右键 **RUN** 了。

> 注意: IDEA 需要安装下 lombok 插件即可。

[gs-accessing-data-mysql](../../spring-guides/gs-accessing-data-mysql)

## 参考
1. <https://spring.io/guides/gs/accessing-data-mysql/>
