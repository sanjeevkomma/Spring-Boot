# To Read
* Circular Dependency =  Circular Dependency occurs when a bean A depends on another bean B, and the bean B depends on bean A as well


# Reference
* [Design Patterns in Spring](https://www.baeldung.com/spring-framework-design-patterns)
* [Circular Dependencies in Spring](https://www.baeldung.com/circular-dependencies-in-spring)

# Additonal Info 
* Spring Boot features
* Spring Boot Auto Configuration
* Spring Boot vs Spring vs Spring MVC
* Waterfall -> Agile -> DevOps
* Spring Boot Projects with Auto Configuration
       ---- JPA = i) JPA ii) Hibernate
       ---- Web = i) Spring MVC(Web application), ii)Spring Core, iii)Spring Validation Framework, iv)Spring Logging Framework v) REST API
      ------ Test
       ----Security
       ----- Actuator
       ------ Developer Tools
* Embedded Servers = Tomcat, Jetty, Undertow
* We can include Tomcat jar /Tomcat server inside the application jar
* To build production ready application quickly
* It provides some non-functional features
            ---- embedded servers
           ---- metrics
           ----- health checks
          ------ externalized configuration ( Dev, QA, Prod ) , Profiling for Dev, QA, Prod
* Spring Boot does NOT generate code
* Spring Boot is NOT web / application server
* Major advantage of Spring Boot is Auto Configuration for
                                 i) Data source
                                 ii) configuring view-resolver
                                 iii) configure spring security filter in web.xml
                                 iv) configure DispatcherServelet in web.xml
                                 v) default exception handling
                                 vi) spring.xml
                                 vii) compatible versions of dependencies with Spring MVC
                                 viii) defining component scan
                                  ix) message source for i18n application & locale resolver
* @SpringBootApplication = i) It indicates spring context ii) It enables auto configuration iii) it enables auto scan
* Spring Boot Auto Configuration Jar will enable auto configuration
-------------------------
* Spring Framework --- Dependency Injection, IOC, Spring Modules ( Spring JDBC, Spring MVC, Spring AOP, Spring ORM, Spring JMS, Spring Test ) , Integration with other Frameworks ( Hibernate for ORM, iBatis for Object Mapping, Junit & Mockito for Unit Testing )
* Spring MVC  ---- Web Application ( DispatcherServlet, ModelAndView, ViewResolver ), REST API
* Spring Boot  ---- Auto Configuration ( DispatcherServlet, ViewResolver, Datasource etc ) , Spring Boot starter projects, Embedded servers, Logback & Log4j frameworks
* Auto Configuration === Spring Boot looks at a) Frameworks available on the CLASSPATH b) Existing configuration for the application. Based on these, Spring Boot provides basic configuration needed to configure the application with these frameworks
* https://www.springboottutorial.com/spring-boot-vs-spring-mvc-vs-spring
* Spring Boot Starter Web depends on  Spring Boot Starter
* https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/howto-logging.html
* https://docs.spring.io/spring-boot/docs/current/reference/html/auto-configuration-classes.html#auto-configuration-classes
* https://docs.spring.io/spring-boot/docs/2.1.6.RELEASE/reference/html/using-boot-build-systems.html#using-boot-starter
* Spring Boot actuator ---> 1) to know beans configured in app 2) to know how auto configuration works 3) how many times, a service is called / failed 4) metrics , http tracing , mappings etc
* http://localhost:8080/actuator, configure management.endpoints.web.exposure.include=* in YML file
* Download Spring Tool Eclipse Plugin into Eclipse
* http://localhost:8080 -- > it navigates to HAL browser
* We can't enable actuator in Prod , which causes performance issues
* Spring Boot developer tools  --> It automatically restart the application, takes less time to restart because it re-loads application related beans ONLY , not all maven dependencies


