# Microservices with Spring Boot
* We use [Spring Cloud](https://spring.io/projects/spring-cloud) to develop micro services
* [Netflix OSS](https://netflix.github.io/) components are Eureka, Hystrix, Zuul, Archaius
# Prerequisites
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Node.js](https://nodejs.org/).
# Used Libraries
  1. Spring Clould Netflix Eureka = service registration and service discovery. 
  2. Spring Cloud Config Server(port:8888) = centralize the configuration of micro services. [maven dependany](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-config-server)
  3. Spring Cloud Netflix Eureka Naming Server(port:8761) = Its known as Discovery Server that registers the client services with their port numbers and IP addresses. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-server)
  4. Spring Cloud Netflix Eureka Client = [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client)
  5. Spring Clould Netflix Zuul API Gateway Server(port:8765) = gateway service that provides dynamic routing, monitoring, resiliency, security, analytics,logging. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-zuul)
  6. Spring Cloud Netflix Ribbon = client side load balancer. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-ribbon)
  7. Spring Cloud Open Feign = declarative REST client / easier REST Client. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign)
  8. Spring Cloud Netflix Hystrix = latency and fault tolerance. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-hystrix)
  9. Spring Cloud Netflix Sleuth = distributed tracing via logs. [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-sleuth-zipkin)
  10. Spring Cloud Netflix Zipkin Distributed Tracing Server(port:9411) = distributed tracing system with request visualization & monitoring
  11. [Spring Cloud Gateway Server](https://spring.io/projects/spring-cloud-gateway) = [maven dependancy](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-gateway-server)
# Reference
* [Microservices Tutorial JavaTPoint](https://www.javatpoint.com/microservices)
* [Build a Microservices Architecture for Microbrews with Spring Boot](https://developer.okta.com/blog/2017/06/15/build-microservices-architecture-spring-boot)
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



