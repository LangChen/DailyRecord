# 项目描述
SpringBoot项目模板，用于快速搭建SpringBoot项目。提供基础功能（定义项目包结构、Mybatis配置（自动创建实体类、mapper类），jackson配置，异常拦截器、出错处理）。

# 框架版本
SpringBoot 2.2.6.RELEASE

JDK 1.8

### Mybatis 配置问题

1.Mybatis生成器

context下的标签需要按顺序添加：

"(property*,plugin*,commentGenerator?,jdbcConnection,javaTypeResolver?,javaModelGenerator,sqlMapGenerator?,javaClientGenerator?,table+)"

