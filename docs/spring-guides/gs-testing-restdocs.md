# 使用 Spring Restdocs 生成文档

## 概述
使用 Spring Restdocs 生成文档

## 知识点

## 注意
1. [官方文档](https://spring.io/guides/gs/testing-restdocs/) 生成 HTML 的部分，Maven 的配置是空的，只有 Gradle 的配置 - - 、  

以下 maven 插件找不到，也是奇怪:
```xml
<plugin>
    <!-- 该插件找不到，也是奇怪 -->
    <groupId>org.asciidoctor</groupId>
    <artifactId>asciidoctor-maven-plugin</artifactId>
    <version>1.6.0</version>
    <executions>
        <execution>
            <id>generate-docs</id>
            <phase>prepare-package</phase>
            <goals>
                <goal>process-asciidoc</goal>
            </goals>
            <configuration>
                <sourceDocumentName>index.adoc</sourceDocumentName>
                <backend>html</backend>
                <attributes>
                    <snippets>${project.build.directory}/snippets</snippets>
                </attributes>
                <doctype>book</doctype>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## 代码
下载 IDEA，即可直接右键 **RUN** 了。

> 注意: IDEA 需要安装下 lombok 插件即可。

[gs-testing-restdocs](../../spring-guides/gs-testing-restdocs)

## 参考
1. <https://spring.io/guides/gs/testing-restdocs/>