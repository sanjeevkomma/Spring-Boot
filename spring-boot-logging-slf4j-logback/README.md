# Spring Boot SLF4j Logback

Article link : https://www.mkyong.com/spring-boot/spring-boot-slf4j-logging-example/

# Definition
* SLF4J : The Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks (e.g. java.util.logging, logback, log4j) allowing the end user to plug in the desired logging framework at deployment time

# To Read
* Spring Boot internally uses [Logback](https://logback.qos.ch/) framework for logging
* [SLF4J](https://www.slf4j.org/) just delegates the request to Logback for actual logging in Spring Boot. Here, Logback will do actual logging in Spring Boot
* Default Log level for Spring Boot is "INFO"
* Spring Boot logback XML files are 1) logback-spring.xml 2) logback.xml
* Java Util Logging
* Log4j is logging framework for java applications.
* Log4j 2 & logback are extensions to Log4j. 
* Spring boot uses Logback framework
* SLF4J implemenation supports Log4J, Log4J 2, Logback
* SLF4J ( Simple Logging Façade for Java ) is a Wrapper / API to call Log4J / Log4J 2 / Logback library
* SLF4J jar internally calls Log4J jar for logging
* SLF4J does not do actual logging, instead it will call logging library ( Log4J / Log4J 2 / Logback ) for logging
* SLF4J acts as interface to  Log4J / Log4J 2 / Logback library

# Logging Libraries / Frameworks
1. Log4J 
2. SLF4J ( Simple Logging Façade for Java )  = It is a Wrapper / API to call Log4J / Log4J 2 / Logback library
3. Log4J 2 
4. Logback

# Appenders
1. Console 
2. File 
3. Rolling File ( Daily )
4. JDBC
5. SMTP
6. JMS
7. Logstash

# Handlers
1. Console Handler
2. File Handler
3. Stream Handler
4. Socket Handler
5. Memory Handler

# Terminology
* Façade = Front Part
* Spirng JCL = Jakarta Commons Logging API

# Tutorial
* [Java Logging: Handlers](http://tutorials.jenkov.com/java-logging/handlers.html)

# Reference
* [How to do logging in Spring Boot](https://www.youtube.com/watch?v=lGrcZsw-hKQ)
* [Logback vs SLF4J vs Log4J2 - what is the difference](https://www.youtube.com/watch?v=SWHYrCXIL38)
* [Log4J Vulnerability (Log4Shell) Explained](https://www.youtube.com/watch?v=uyq8yxWO1ls)
* [How to do logging in Spring Boot](https://www.youtube.com/watch?v=lGrcZsw-hKQ)

# Image
1. Spring Boot Logging which internally uses Logback framework for logging 
* ![image](https://user-images.githubusercontent.com/7721150/147807323-8d0885af-7aa6-45c4-b05d-f19c93b13d39.png)
* ![image](https://user-images.githubusercontent.com/7721150/147808383-4f831aca-e156-4e37-93f0-d0e22ebc7d22.png)
