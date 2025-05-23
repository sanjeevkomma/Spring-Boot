# Step-by-Step Upgrade Guide: Spring Boot 2.x → 3.x
# 1. Upgrade to Java 17 or later
# 2. Update Spring Boot version
# 3. Update javax.* to jakarta.*
* javax.servlet → jakarta.servlet
* javax.persistence → jakarta.persistence
* javax.validation → jakarta.validation
# 4. Update Dependencies
| #Library  | #Action |
 | :--- | :--- | 
 |Spring Cloud | Use 2022.x or newer |
 |Spring Security | Many API changes; update imports |
 |Hibernate | Upgrade to 6.x |
 |Actuator endpoints | /actuator/xyz paths and security config may change |
 |Jackson, Micrometer | Ensure version compatibility |
 |Flyway/Liquibase | Upgrade for Java 17 support |
 |Tomcat/Jetty/Undertow | Ensure updated versions (via Spring Boot starters) |
# 5. API Changes to Watch Out For
| #Area  | #Breaking Change |
| :--- | :--- | 
|@RequestMapping method params | Narrowed matching rules |
|WebSecurityConfigurerAdapter | Deprecated → use SecurityFilterChain bean |
|spring.factories | Replaced with META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports |
|CORS Config | Stricter defaults |
|Reactive APIs | Improved but stricter compatibility |
# 6. Improved but stricter compatibility
* Review application.properties or application.yml:
  * Some property names may have changed (e.g., server.ssl.*, spring.datasource.*)
* Run the app and check for:
  * Missing beans
  * Property parsing errors
  * Deprecated or invalid configs
# 7. Rebuild and Test Thoroughly
* Rebuild your project using Maven/Gradle
* Run unit tests, integration tests, and manual testing
* Use tools like:
  * spring-boot-migrator
  * OpenRewrite recipes
























