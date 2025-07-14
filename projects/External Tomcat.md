#  Update your build.gradle:
* // Remove war plugin and add Spring Boot plugin
apply plugin: 'org.springframework.boot'
apply plugin: 'io.spring.dependency-management'
// remove 'war' plugin

buildscript {
    dependencies {
        classpath "org.springframework.boot:spring-boot-gradle-plugin:3.5.3"
        // keep other existing buildscript dependencies
    }
}

// Update dependencies
dependencies {
    // Remove tomcat configuration dependencies
    implementation 'org.springframework.boot:spring-boot-starter-web:3.5.3'
    implementation 'org.springframework.boot:spring-boot-starter-tomcat:3.5.3'
    
    // Remove war-related dependencies
    // Remove javax.servlet dependencies
    
    // Remove existing tomcat dependencies
    // Remove jetty dependencies since we'll use embedded tomcat
}

// Remove war configuration block
// Remove webInf configuration

# Create an application properties file src/main/resources/application.yml:
server:
  port: 7540
  ssl:
    enabled: true
    key-store: ${keystore.file}
    key-store-password: ${keystore.pass}
    protocol: TLS
  tomcat:
    max-threads: 200
    accept-count: 100
    connection-timeout: 20000
    compression:
      enabled: true
      mime-types: text/html,text/xml,text/plain,text/css,text/javascript,text/json,application/x-javascript,application/javascript,application/json


 # Update your main application class:
@SpringBootApplication
public class MediaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MediaServiceApplication.class, args);
    }

    @Bean
    public TomcatServletWebServerFactory tomcatFactory() {
        return new TomcatServletWebServerFactory() {
            @Override
            protected void customizeConnector(Connector connector) {
                connector.setProperty("relaxedQueryChars", "[]|{}^&#x5c;&#x60;&quot;&lt;&gt;");
                connector.setProperty("compression", "on");
                connector.setProperty("compressionMinSize", "2048");
                connector.setProperty("noCompressionUserAgents", "gozilla, traviata");
                connector.setProperty("compressableMimeType", 
                    "text/html,text/xml,text/plain,text/css,text/javascript,text/json,application/x-javascript,application/javascript,application/json");
            }
        };
    }
}

# Remove Tomcat-specific files:
Delete src/main/tomcat directory
Delete src/main/web/WEB-INF/web.xml

# Move static resources:
Move from src/main/web to src/main/resources/static
Move JSPs to src/main/resources/templates (consider migrating to Thymeleaf)

# Update your logging configuration in application.yml:
logging:
  file:
    path: ${NOMAD_ALLOC_DIR:/tmp}/logs
  pattern:
    file: "%t \"%{X-Forwarded-For}i \"%r\" %s %b %{User-Agent}i %Dms"

# Add Spring Boot's actuator for monitoring
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-actuator:3.5.3'
}

# key changes
* Removed external Tomcat configuration
Switched from WAR to JAR packaging
Moved Tomcat configuration to Spring Boot properties
Embedded Tomcat configuration in the application
Removed web.xml in favor of Java configuration
Updated dependencies to Spring Boot 3.5.3


# Remeber to
Test SSL configuration thoroughly
Verify all endpoints work with embedded Tomcat
Update any custom Tomcat configurations through Spring Boot properties
Test compression and connection settings
Update deployment scripts to deploy JAR instead of WAR













 
