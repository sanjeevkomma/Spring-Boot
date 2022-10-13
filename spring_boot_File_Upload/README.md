# To Read

# How to build :
    1. mvn clean install -Dmaven.test.skip=true

# How to start : 

    1. Run as java applicaton by setting dev OR prod profile : ( -Dspring.profiles.active=dev,SG ) 
    OR
    2. mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev,SG"
    OR
    3. java -jar -Dspring.profiles.active=dev,SG target/spring_boot_File_Upload-0.0.1-SNAPSHOT.jar 
    
# Commands
1. $ java -jar lombok-1.18.24.jar

# Reference
* [Spring Boot File Upload and Download REST API | Spring Data JPA](https://www.youtube.com/watch?v=XUL60-Ke-L8&t=11s)
