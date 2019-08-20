java -jar eureka/target/eureka-0.0.1-SNAPSHOT.jar
java -jar eureka/target/eureka-0.0.2-SNAPSHOT.jar
java -jar service-product-foo/web/target/service-product-foo-web-0.0.1-SNAPSHOT.jar
java -jar service-product-duo/web/target/service-product-duo-web-0.0.1-SNAPSHOT.jar
java -jar service-comsume/target/service-comsume-0.0.1-SNAPSHOT.jar
java -jar zuul/target/zuul-0.0.1-SNAPSHOT.jar
:${spring.cloud.client.ip-address}:${server.port}
