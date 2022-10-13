Spring boot Profile YAML

How to build :
    1. mvn clean install -Dmaven.test.skip=true

How to start : 

    1. Run as java applicaton by setting dev OR prod profile : ( -Dspring.profiles.active=prod,hk -Dperson.name=Test ) 
    OR
    2. mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=prod,hk --person.name=Test"
    OR
    3. java -jar -Dspring.profiles.active=prod,hk -Dperson.name=Test target/profile-yaml-0.0.1-SNAPSHOT.jar 
    
Output :
![image](https://user-images.githubusercontent.com/7721150/146057008-24ecc099-91a1-4aca-ac31-293d80c0f94d.png)

    
    
    
    
