Spring boot Profile YAML

How to start : 

    1. mvn clean install -Dmaven.test.skip=true
    
    2. Run as java applicaton by setting dev OR prod profile : ( -Dspring.profiles.active=prod,hk -Dperson.name=Test ) 
    
    3. mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=prod,hk --person.name=Test"
    
    4. java -jar -Dspring.profiles.active=prod,hk -Dperson.name=Test target/profile-yaml-0.0.1-SNAPSHOT.jar 
    
    ![image](https://user-images.githubusercontent.com/7721150/146056805-d79115f9-cbf8-44dc-9e70-c044089ceba8.png)


    
    
    
