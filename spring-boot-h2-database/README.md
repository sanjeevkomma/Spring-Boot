Spring Boot Version : 2.3.0.M1

H2 Console :  http://localhost:8080/h2-console/login.jsp

mvn clean install

mvn eclipse:clean

mvn eclipse:eclipse

How to start :  

    1. mvn spring-boot:run
    
    2. Access H2 Console ( http://localhost:8080/h2-console/login.jsp ) 
    
REST API : 

    1. Get All User : GET : http://localhost:8080/user
    
    2. Get User : GET : http://localhost:8080/user/{id}
    
    3. Delete User : DELETE : http://localhost:8080/user/{id}
    
    4. Save User : POST : http://localhost:8080/user
