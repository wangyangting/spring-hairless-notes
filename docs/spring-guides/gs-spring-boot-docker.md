# Spring Boot 集成 Docker

## 概述
Spring Boot 集成 Docker

## 知识点
1. Spring Boot 应用集成 Docker
2. Docker build 编译镜像
3. Docker run 启动镜像（-p 本机端口:镜像端口）
4. Windows bat 脚本

## Docker

1. [Dockerfile](../../spring-guides/gs-spring-boot-docker/Dockerfile)
    ```shell
    FROM openjdk:8-jdk-alpine
    RUN addgroup -S spring && adduser -S spring -G spring
    USER spring:spring
    ARG JAR_FILE=target/*.jar
    COPY ${JAR_FILE} app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]
    ```
2. 项目编译
    ```shell
    mvn clean package
    ```
3. 镜像构建  
    ```shell
    docker build -t hairless/gs-spring-boot-docker .
    ```
4. 启动镜像
    ```shell
    docker run -p 8080:8080 hairless/gs-spring-boot-docker
    ```
5. 浏览器访问  
    浏览器访问地址 <http://127.0.0.1:8080/> 即可。

以上所有操作，已经封装到 [run.bat](../../spring-guides/gs-spring-boot-docker/run.bat) 了，可以直接在 Windows 系统下运行即可，会执行项目编译，镜像构建，启动镜像的操作。

## 代码
下载 IDEA，即可直接右键 **RUN** 了。

[gs-spring-boot-docker](../../spring-guides/gs-spring-boot-docker)

## 参考
1. <https://spring.io/guides/gs/spring-boot-docker/>
