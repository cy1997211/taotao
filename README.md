一：淘淘商城
1.创建taotao-parent(pom)聚合工程
2.创建taotao-common（jar）工具类继承1(dependency common-lang-jar)
3.taotao-manager(pom)继承1依赖2
4.taotao-manager-pojo(jar)继承1(不依赖任何包)
5.taotao-manager-mapper(jar)继承1依赖4(依赖mybatis、mysql等)
6.taotao-manager-service(jar)继承1依赖5(依赖spring、springmvc等)
7.taotao-manager-web(jar)继承1依赖6(+依赖jsp、文件上传等)

a.启动时需要给parent和common工程 install安装到.m2仓库
b.需要在manager的pom里配置tomcat插件

8.建一个taotao-rest服务层（war）
9.建一个taotao-portal门户（war）
