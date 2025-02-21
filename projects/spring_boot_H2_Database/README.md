# Technology Stack :    
1. Java 8
2. Spring Boot 2.3.0.M1
3. H2 DB

# Application Design : 

# Commands : 
1. mvn clean install
2. mvn eclipse:clean
3. mvn eclipse:eclipse

# How to Start : 
1. git clone https://github.com/sanjeevkomma/spring-boot.git
2. mvn spring-boot:run
3. Access H2 Console ( http://localhost:8080/h2-console/login.jsp ) 
    
# Create, Run Docker Image in Local Machine and Push to Docker Hub
1. Have "Dockerfile" file in project root directory
2. $ docker build -t sanjeevkomma/spring-boot-h2-database:0.0.1.RELEASE .
3. $ docker run -p 8080:8080 -t sanjeevkomma/spring-boot-h2-database:0.0.1.RELEASE
4. $ docker push sanjeevkomma/spring-boot-h2-database:0.0.1.RELEASE
5. [Spring Boot docker reference](https://spring.io/guides/gs/spring-boot-docker/)    
    
# REST API : 
1. Get All User : GET : http://localhost:8080/user
2. Get User : GET : http://localhost:8080/user/{id}
3. Delete User : DELETE : http://localhost:8080/user/{id}
4. Save User : POST : http://localhost:8080/user
    
## cURL ( Client URL ) :
1. Get All User : GET : curl -v localhost:8080/user
