### 项目结构：

|名称|说明| 
|---|---|
|parent|springcloud整合的父级项目，版本为springboot：2.1.7.RELEASE，springcloud：Greenwich.SR2|
|eureka|项目中配置了两个eureka做高可用服务注册中心|
|provider-*|provider作为服务提供项目,有provider-shenzhen和provider-chongqing两个提供服务,sleuth链路跟踪用zipkin展示|
|consumer-*|consumer作为服务调用项目，consumer-fudi调用provider-chongqing，consumer-fudong调用provider-shenzhen;采用feign调用;配置hystrix容断器，hystrix仪表板,sleuth链路跟踪用zipkin展示|
|turbine|收集hystrix仪表盘信息后汇总显示，方便监控，收集consumer-*中调用信息|
|zuul|整个项目的网关，防止非法访问；这里做了token校验|
|config|配置中心，从外部仓库获取配置信息，做到动态跟新，配置了从git仓库获取方式|
|config-client|配置文件客户端，测试从config配置中心获取配置信息，实际开发中会整合到具体项目,利用rabbitmq做了消息总线|

### 提示：
1. turbine 查看地址：http://localhost:10006/hystrix 
   ,输入：http://localhost:10006/turbine.stream
2. zipkin查看地址：http://localhost:9411/ 
3. eureka注册中心查看地址：http://localhost:10001/ 
4. config-client通过消息总线更新的url：http://localhost:10009/actuator/bus-refresh，发post请求
5. config查看配置文件：http://localhost:10008/springcloud/dev/master
