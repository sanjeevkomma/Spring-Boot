Spring Boot Version : 2.3.0.M1

H2 Console :  http://localhost:8080/h2-console/login.jsp

Commands : 

   1. mvn clean install

   2. mvn eclipse:clean

   3. mvn eclipse:eclipse

How to Start :  

    1. mvn spring-boot:run
    
    2. Access H2 Console ( http://localhost:8080/h2-console/login.jsp ) 
    
REST API : 

    1. Get All User : GET : http://localhost:8080/user
    
    2. Get User : GET : http://localhost:8080/user/{id}
    
    3. Delete User : DELETE : http://localhost:8080/user/{id}
    
    4. Save User : POST : http://localhost:8080/user
    
cURL ( Client URL ) :

    1. Get All User : GET : curl -v localhost:8080/user
