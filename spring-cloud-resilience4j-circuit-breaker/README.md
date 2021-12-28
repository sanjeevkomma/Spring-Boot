# To Read
* Circuit breaker states are Closed, Open, Half Open
* Resilienc4j Types are Circuit breaker, Retry, Rate limiter, Bulkhead, Time Limiter
# Terminology
* Rate limiting = Rate limiting is a strategy to limit access to APIs. It restricts the number of API calls that a client can make within a certain time frame
# Tutorial
* [resilience4j](https://resilience4j.readme.io/docs/getting-started)

# Usage
* fault tolerance
* retry 
* service down
* service slow

# Annotations
1. @Retry
2. @CircuitBreaker = It breaks the circuit and gives default response back
3. @RateLimiter = For ex : In 10 secs, allow only 2 calls to the API
4. @Bulkhead = Configue max concurrent calls to the API. ( For ex : 10 concurrent calls to the API )

# Interfaces

# Tutorial
* [resilience4j-circuitbreaker](https://resilience4j.readme.io/docs/circuitbreaker)

# Reference
* [Hystrix Circuit Breaker Pattern – Spring Cloud](https://howtodoinjava.com/spring-cloud/spring-hystrix-circuit-breaker-tutorial/#what-is-circuit-breaker)
* [Spring Cloud- Netflix Eureka + Ribbon + Hystrix Simple Example](https://www.javainuse.com/spring/spring_hystrix)
* [Resilience4J: Circuit Breaker Implementation on Spring Boot](https://medium.com/bliblidotcom-techblog/resilience4j-circuit-breaker-implementation-on-spring-boot-9f8d195a49e0)


![image](https://user-images.githubusercontent.com/7721150/147554842-e993c3ef-08f5-4429-bc39-93fc91f9a073.png)

