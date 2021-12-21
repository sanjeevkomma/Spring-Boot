# Microservices with Spring Cloud
# Prerequisites
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and [Node.js](https://nodejs.org/).
# To Read
* We use [Spring Cloud](https://spring.io/projects/spring-cloud) to develop Micro Services
* [Netflix OSS](https://netflix.github.io/) components are Eureka, Hystrix, Zuul, Archaius
* Below features are implemented at API Gateway level
1. Authentication
2. Autherization
3. Security
5. Service Aggregation
* http://localhost:<port>/{App-Name}/{URI}
* Zuul API Gateway uses AppName in the URL to talk to Eureka Server and find the URL of the Micro Service
* [Microservices Guide](https://martinfowler.com/microservices/)
* [Microservice Architecture](https://microservices.io/patterns/microservices.html)
* [Event-driven architecture with Microservice](https://microservices.io/patterns/data/event-driven-architecture.html)
* [Event-Driven Microservice Architecture](https://medium.com/trendyol-tech/event-driven-microservice-architecture-91f80ceaa21e)
  
# Used Libraries
  1. Spring Boot Dev Tools = Used to pick the changes with out restarting the app. [maven](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)
  2. Spring Clould Netflix Eureka = service registration and service discovery. 
  3. [Spring Cloud Config Server](https://cloud.spring.io/spring-cloud-config/reference/html/#_quick_start) = centralize / store the configuration of micro services. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-config-server). bootstrap.properties can be used to link between micro service & spring cloud config server. Git local repository folder will be as part of Sping cloud config server to configure properties cetrally
  4. Spring Cloud Config Client
  5. Spring Cloud Netflix Eureka Naming Server(port:8761) = Its known as Discovery Server that registers the client services with their port numbers and IP addresses. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-server)
  6. Spring Cloud Netflix Eureka Client = [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client)
  7. Spring Clould Netflix Zuul API Gateway Server(port:8765) = gateway service that provides dynamic routing, monitoring, resiliency, security, analytics,logging. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-zuul)
  8. Spring Cloud Netflix Ribbon = client side load balancer. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-ribbon)
  9. Spring Cloud Open Feign = declarative REST client / easier REST Client. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign)
  10. [Spring Cloud Netflix Hystrix](https://www.baeldung.com/spring-cloud-netflix-hystrix) = latency and fault tolerance. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-hystrix). [Hystrix Circuit Breaker Pattern Example](https://howtodoinjava.com/spring-cloud/spring-hystrix-circuit-breaker-tutorial/#what-is-circuit-breaker)
  11. Spring Cloud Netflix Sleuth = Sleuth will assign unique id to the request for tracing the request across the componenets. Each micro service will put the logs into Rabbit MQ & Zipkin Server will listen to this Rabbit MQ for logs. Distributed tracing via logs. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-sleuth-zipkin)
  12. Spring Cloud Netflix Zipkin Distributed Tracing Server(port:9411) = It will centralize all the logs of each component into one place(centralized Zipkin dashboard). Distributed tracing system with request visualization & request monitoring. Zipkin Server and ELK Stack both will do the same for centralizing the logs into dashboard. Zipkin server is connected to database. [zipkin server quickstart](https://zipkin.io/pages/quickstart)
  13. [Spring Cloud Gateway Server](https://spring.io/projects/spring-cloud-gateway) = [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-gateway-server)
  14. [Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/) = It provides route to APIs and cross cutting concerns such as security,  monitoring, metrics and resiliency to APIs. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-gateway)
  15. [Spring Cloud – Bootstrapping](https://www.baeldung.com/spring-cloud-bootstrapping) = Used to load properties from external sources(for ex : XXX.properties) into bootstrap.properties. [maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-bootstrap)
  16. [Spring Boot Actuator](https://www.javatpoint.com/spring-boot-actuator) =  Used to monitor the health and manage the Spring Boot application. http://localhost:8080/actuator/health. [maven](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-actuator)
  17. [Spring Cloud Bus](https://cloud.spring.io/spring-cloud-bus/reference/html/) = It uses Kafka or Rabbit MQ(AMQP protocol) to update the central configuration changes to all micro services in the application.[spring cloud bus maven](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-bus-amqp),[spring rabbit maven](https://mvnrepository.com/artifact/org.springframework.amqp/spring-rabbit)
  18. [Spring web flux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux) = [Spring Webflux: Getting started](https://dzone.com/articles/spring-webflux-getting-started)
# Components of Microservices 
1. Spring Cloud Config Serverfor(http://localhost:8888/service-name/default)
2. Netflix Eureka Naming Server(http://localhost:8761)
3. Hystrix Server --- Resilience4j
4. Netflix Zuul API Gateway Server --- Spring Cloud Gateway
5. Netflix Ribbon -- Spring Cloud LoadBalancer
6. Zipkin Distributed Tracing Server(http://localhost:9411/zipkin)
# Order of Micro services start
1. Eureka Naming Server
2. Zipkin Server
3. Micro services ( for ex: book service , order service ) 
4. Zuul API Gateway Server
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
* [How to Setup the Spring Cloud Config Server With Git](https://dzone.com/articles/how-to-setup-the-spring-cloud-configuration-server-with-git)
* [eureka-server-how-to-achieve-high-availability](https://stackoverflow.com/questions/38549902/eureka-server-how-to-achieve-high-availability)
* [zookeeper-vs-eureka-for-microservices](https://stackoverflow.com/questions/48635782/what-is-the-role-of-zookeeper-vs-eureka-for-microservices)
# Terminology
* fault tolerance = fallback
# Monolithic vs Microservice
![image](https://user-images.githubusercontent.com/7721150/144594924-f512b8e3-0c1c-4a1f-b5ff-b6361ed657f9.png)



