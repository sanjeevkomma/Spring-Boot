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
* @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration and @ComponentScan with their default attributes
* @EnableAutoConfiguration annotation tells Spring Boot to "guess" how you will want to configure Spring, based on the jar dependencies that you have added. For example, If HSQLDB is on your classpath, and you have not manually configured any database connection beans, then Spring will auto-configure an in-memory database.
* @ComponentScan tells Spring to look for other components, configurations, and services in the specified package. Spring is able to auto scan, detect and register your beans or components from pre-defined project package. If no package is specified current class package is taken as the root package

# Terminology
* Rate limiting = Rate limiting is a strategy to limit access to APIs. It restricts the number of API calls that a client can make within a certain timeframe
* Spirng JCL = Jakarta Commons Logging API

# Tutorial
* [Spring Projects](https://spring.io/projects)
* [Spring Boot Versions](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot)
* [Spring Boot Doc](https://spring.io/projects/spring-boot)
* [Spring Cloud Doc](https://spring.io/projects/spring-cloud)

# [Annotations](https://www.journaldev.com/16966/spring-annotations)
|SNo| #Annotations  | #Discription |
|:--- | :--- | :--- | 
|1 |@Bean | It will give instance of the class(method return Type) to Spring. It can be applied to a method |
| 2|@Autowired | It can be applied to Variable / Method for autowiring byType |
| 3|@Qualifier |1. The @Qualifier annotation is used to resolve the autowiring conflict, when there are multiple beans of same type. 2. It helps to avoid ambiguity of different beans with the same type |
|4 |[@Configuration](https://stackoverflow.com/questions/39247487/why-spring-boot-application-class-needs-to-have-configuration-annotation) | It is used in Java-based configuration on Spring framework|
| 5|@SpringBootApplication | @Configuration + @ComponentScan + @EnableAutoConfiguration|
| 6|@ConfigurationProperties | |
| 7|@ComponentScan | It scans for Spring components such as @Service, @Controller, @Repository , @Configuration, @Component etc |
| 8|@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})|It is used for auto-configuring beans present in the classpath in Spring Boot application|
| 9|@EnableWebSecurity ||
| 10|@PropertySource("classpath:oracledatabase.properties")||
| 11|@Retryable | |
|12 |@Recover | |
|13 |@EnableRetry | |
|14 |@Service | |
|15 |@EnableAsync | |
|16 |@RestController | @Controller + @ResponseBody|
|17 |@RequestMapping | |
|18 |[@RefreshScope](https://boot-microservices.hashnode.dev/how-to-use-refreshscope-with-your-datasource-for-dynamic-property-updates-at-runtime)|@RefreshScope is used with your Datasource for dynamic property updates at runtime |


# Properties
| #Property  | #Value |#Discription |
| :--- | :--- | :--- |
| spring.autoconfigure.exclude | 1. org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration  <br> 2. org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration | We can control the list of auto-configuration classes to exclude by using this property |

# Reference
* [Spring vs Spring Boot vs Spring MVC](https://www.javatpoint.com/spring-vs-spring-boot-vs-spring-mvc)
* [How Spring boot works internally](https://stackoverflow.com/questions/44172261/how-spring-boot-application-works-internally)
* [Spring Boot Stackoverflow](https://stackoverflow.com/questions/tagged/spring-boot)
* [Create Spring Boot App using Initializr](https://start.spring.io/)
* [Disable all Database related auto configuration in Spring Boot](https://stackoverflow.com/questions/36387265/disable-all-database-related-auto-configuration-in-spring-boot)
* [Spring & Spring Boot Annotations](https://www.youtube.com/watch?v=htyq-mER0AE)


