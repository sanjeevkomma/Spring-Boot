# To Read

# How to build :
    1. mvn clean install -Dmaven.test.skip=true

# How to start : 

    1. In Eclipse, Run as java applicaton by setting dev OR prod profile : ( -Dspring.profiles.active=dev,SG -DuserName=Tom -DDB_PASSWORD=password123 ) 
    OR
    2. mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev,SG --userName=Tom --DB_PASSWORD=password123"
    OR
    3. java -jar -Dspring.profiles.active=dev,SG -DuserName=Tom -DDB_PASSWORD=password123 target/spring_boot_File_Upload-0.0.1.jar 

# Docker image Build , Run & Push

    1. $ docker build -t sanjeevkomma/spring_boot_file_upload:0.0.2.RELEASE .
    2. $ docker run -p 8080:8080 -t sanjeevkomma/spring_boot_file_upload:0.0.2.RELEASE JAVA_OPTS="-Dspring.profiles.active=dev,SG -DuserName=Tom -DDB_PASSWORD=password123"
    3. $ docker run -e 8080:8080 -t sanjeevkomma/spring_boot_file_upload:0.0.2.RELEASE JAVA_OPTS="-Dspring.profiles.active=dev,SG -DuserName=Tom -DDB_PASSWORD=password123"
    4. $ docker system prune

# Commands
1. $ java -jar lombok-1.18.24.jar

# Reference
* [Spring Boot File Upload and Download REST API | Spring Data JPA](https://www.youtube.com/watch?v=XUL60-Ke-L8&t=11s)
