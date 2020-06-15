# 管理事务

## 概述
Spring 中使用 @Transactional 注解来管理事务

## 知识点
1. lombok 插件使用，减少 PO 对象的方法编写
2. 使用 Spring @Transactional 注解来管理事务
3. 在 Spring JDBC 中初始化数据库（src/main/resources/schema.sql）

> 需要注意 schema.sql 中的 **varchar(5) NOT NULL** 字段约束，示例代码操作时不符合该约束会进行事务回滚

## 代码
下载 IDEA，即可直接右键 **RUN** 了。

> 注意: IDEA 需要安装下 lombok 插件即可。

[gs-managing-transactions](../../spring-guides/gs-managing-transactions)

## 参考
1. <https://spring.io/guides/gs/managing-transactions/>
