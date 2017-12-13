# base-boot

## 项目说明
    适用于前后端分离，有app端和admin端的服务器。（下个项目是前后端分离的，所以没有加页面相关的组件）
## 框架
    gradle搭建, spring-boot, mybatis
## 项目结构
### 项目结构
    base-env: 配置
    baes-db: 采用了spring boot集成的flywaydb。按照命名规则创建sql文件，启动项目时会按照sql文件自动更新数据库结构
    base-common: 共通项目
    base-app: app端
    base-admin: 管理端
### 部分文件说明
    .travis.yml：采用github提供的组件，实现持续化集成与发布
    base-common/db-generate.properties：自动生成代码配置的数据库文件
    base-common/generatorConfig.xml：自动生成代码mybatis generator配置文件
## 运行环境
    jdk: 1.8
    gradle: 4.3+
    spring boot: 1.5.9.RELEASE
    redis: 4.0+
## 运行与维护
    自生成model：
        运行项目将本地数据库更新为最新，更新generatorConfig.xml文件可以修正有需要修改的表
        $$:cd base-common
        $$:gradle -info mybatisGenerate
    项目运行：
        $$:cd base-app
        $$:gradle -info bootRun
    debug：    
        如果采用idea导入项目，可以在编辑器右边侧栏看到gradle的sheet。
        例：右键选择base-app/Tasks/application/bootRun，选择debug模式。
        项目启动后如果想要使修改java文件生效，请选择编辑器中Run/Reload Changed Classes
### PS
    所有的命令行操作都可以在编辑器带的组件中找到，双击命令可以完成相应的操作