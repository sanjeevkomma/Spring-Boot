# Components of Microservices 
1. Spring Cloud Config Server -- (http://localhost:8888/service-name/default)  [ Here , default is environment like 'dev','qa','prod' ]
2. Netflix Eureka Naming Server(http://localhost:8761)
3. Hystrix Server (Circuit Breaker Pattern)--- [resilience4j](https://resilience4j.readme.io/docs/getting-started-3). Used for fault tolerance
4. Netflix Zuul API Gateway Server --- Spring Cloud API Gateway (http://localhost:8765/service-name/uri)
5. Netflix Ribbon -- Spring Cloud LoadBalancer -- Sping Clould Eureka Client internally has load balancer dependant for client side load balancing
6. Zipkin Distributed Tracing Server(http://localhost:9411/zipkin)
# Order of Micro services start
1. Eureka Naming Server
2. Zipkin Server [Zipkin docker image](https://hub.docker.com/r/openzipkin/zipkin/)
3. Micro services ( for ex: book service , order service ) 
4. Zuul API Gateway Server
