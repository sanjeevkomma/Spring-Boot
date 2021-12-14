Spring boot Profile YAML

How to start : 

    1. mvn clean install -Dmaven.test.skip=true
    
    2. Run as java applicaton by setting dev OR prod profile : ( -Dspring.profiles.active=prod,hk -Dperson.name=San ) 
    
    3. mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=prod,hk --person.name=San"
    
    4. java -jar -Dspring.profiles.active=prod,hk -Dperson.name=Test target/profile-yaml-0.0.1-SNAPSHOT.jar 
    
    
    
