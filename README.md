# Installing Tools
* [Rabbit MQ download](https://www.rabbitmq.com/download.html)
* [How to install RabbitMQ on Windows](https://www.youtube.com/watch?v=gKzKUmtOwR4)

# To Read
* Spring boot = Spring MVC + Auto Configuration ( Don't need to write spring.xml file for configurations ) + Server ( You can have embedded Tomcat, Netty, Jetty server )
* Spring boot supports 3 embedded servers : Tomcat (default) , Jetty, Undertow
* By default, Spring Boot 2 uses HikariCP as the default connection pool
* Spring boot Auto Configuration 
* Static Filtering 
* Dynamic Filtering 
* Actuator = Production ready features 
* Validation 
* Spring HATEOAS ( Hypertext as the  of Engine of Application State ) = Links , Entity Links , HAL Support 
* HAL ( Hypertext Application Language ) Browser / Explorer =  
* Spring Open API / Swagger UI 
* Versioning =  Multiple Versions of the same Service = 1) Request Param Versioning 2) Header Versioning 3) Produces / Accept / Media type / Accept Header Versioning 4) URI Versioning 
* Basic Authentication with Sprig Security

# Terminology
* Rate limiting = Rate limiting is a strategy to limit access to APIs. It restricts the number of API calls that a client can make within a certain timeframe
* Spirng JCL = Jakarta Commons Logging API
# Tutorial
* [Spring Projects](https://spring.io/projects)
* [Spring Boot Versions](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot)
* [Spring Boot Doc](https://spring.io/projects/spring-boot)
* [Spring Cloud Doc](https://spring.io/projects/spring-cloud)
# [Annotations](https://www.journaldev.com/16966/spring-annotations)
* @Bean = It will give instance of the class(method return Type) to Spring. It can be applied to a method
* @Autowired = It will ask the instance of the class ,which was created with @Bean annotation.
* @Qualifier =
* @Configuration =
* @ConfigurationProperties = 
* @ComponentScan =
* @Retryable =
* @Recover =
* @EnableRetry =
* @SpringBootApplication
* @Service
* @EnableAsync =
* @RestController = 
* @RequestMapping =
# Reference
* [Spring vs Spring Boot vs Spring MVC](https://www.javatpoint.com/spring-vs-spring-boot-vs-spring-mvc)
* [How Spring boot works internally](https://stackoverflow.com/questions/44172261/how-spring-boot-application-works-internally)
* [Spring Boot Stackoverflow](https://stackoverflow.com/questions/tagged/spring-boot)
* [Create Spring Boot App using Initializr](https://start.spring.io/)





