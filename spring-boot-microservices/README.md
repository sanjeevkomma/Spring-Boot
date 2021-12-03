# Microservices with Spring Boot


Please read [Build a Microservices Architecture for Microbrews with Spring Boot](https://developer.okta.com/blog/2017/06/15/build-microservices-architecture-spring-boot) for a tutorial that shows you how to build this application.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Node.js](https://nodejs.org/).
# Used Libraries
  1. Spring Clould Netflix Eureka = service registration and service discovery. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client)
  2. Spring Cloud Config Server =
  3. Eureka Server = Naming Server
  4. Eureka Client = 
  5. Netflix Zuul = gateway service that provides dynamic routing, monitoring, resiliency, security. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-zuul)
  6. Spring Cloud Netflix Ribbon = client side load balancer. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-ribbon)
  7. Spring Cloud Open Feign = declarative REST client / easier REST Client. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign)
  8. Spring Cloud Netflix Hystrix = latency and fault tolerance. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-hystrix)
  9. Spring Cloud Netflix Sleuth = distributed tracing via logs. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-sleuth-zipkin)
  10. Spring Cloud Netflix Zipkin = distributed tracing system with request visualization
  11. Netflix API Gateway = 
# Reference
* [Microservices Tutorial JavaTPoint](https://www.javatpoint.com/microservices)
* [Spring Cloud Netflix](https://cloud.spring.io/spring-cloud-netflix/2.0.x/single/spring-cloud-netflix.html)
* [Create an API Gateway with Load Balancer Using Java](https://dzone.com/articles/create-an-api-gateway-with-load-balancer-in-java)
* [LOAD-BALANCER-WITH-API-GATEWAY :: Github](https://github.com/VishnuViswam/LOAD-BALANCER-WITH-API-GATEWAY)
* [sample-spring-microservices :: Github](https://github.com/piomin/sample-spring-microservices)
* [Setting up ZUUL gateway between micro services](https://stackoverflow.com/questions/64427773/setting-up-zuul-gateway-between-micro-services)
* [Creating microservice using spring cloud,eureka and zuul](https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/)
* [A New Era Of Spring Cloud](https://dzone.com/articles/a-new-era-of-spring-cloud)
* [Service discovery and heartbeats in micro-services](https://www.youtube.com/watch?v=lWE_UIbm8NA&list=RDCMUCRPMAqdtSgd0Ipeef7iFsKw&index=26)
# Terminology
* fault tolerance = fallback
# Monolithic vs Microservice
![image](https://user-images.githubusercontent.com/7721150/144594924-f512b8e3-0c1c-4a1f-b5ff-b6361ed657f9.png)



