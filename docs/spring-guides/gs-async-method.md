# 异步方法的使用

## 概述
Spring 中异步方法的使用

## 知识点
1. lombok 插件使用，减少 POJO 对象的方法编写
2. @Async 注解的使用
3. CompletableFuture 类的使用
4. Executor 类的配置

## Executor 配置
```java
@Bean
public Executor taskExecutor() {
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    executor.setCorePoolSize(2);
    executor.setMaxPoolSize(2);
    executor.setQueueCapacity(500);
    executor.setThreadNamePrefix("GithubLookup-");
    executor.initialize();
    return executor;
}
```

## 代码
下载 IDEA，即可直接右键 **RUN** 了。

> 注意: IDEA 需要安装下 lombok 插件即可。

[gs-async-method](../../spring-guides/gs-async-method)

## 参考
1. <https://spring.io/guides/gs/async-method/>
