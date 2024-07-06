# To Read
* Gradle is a build tool with a focus on build automation and support for multi-language development. 
* If you are building, testing, publishing, and deploying software on any platform, Gradle offers a flexible model that can support the entire development lifecycle from compiling and packaging code to publishing web sites. 
* Gradle has been designed to support build automation across multiple languages and platforms including Java, Scala, Android, C/C++, and Groovy, and is closely integrated with development tools and continuous integration servers including Eclipse, IntelliJ, and Jenkins.

# Installation
* [Gradle Installation](https://gradle.org/install/)
* [Gradle Distributions](https://services.gradle.org/distributions/)
* [Gradle Releases](https://gradle.org/releases/)

# [Gradle supports the following repository formats](https://www.javatpoint.com/gradle-repository)
1. Ivy repositories
2. Maven repository
3. Flat directory repository

# Commands
1. $ ./gradlew --version == To know Gradle version
2. $ ./gradlew build == To build
3. $ ./gradlew build -x test == To build , skip test
4. $ ./gradlew clean == To clean
5. $ ./gradlew tasks ==
6. $ ./gradlew check == To run all checks
7. $ ./gradlew test == To run the test suite
8. $ ./gradlew properties == To display the properties of root project
9. $ ./gradlew dependencies == To display all dependencies declared in root project
10. $ ./gradlew projects == To display the sub-projects of root project
11. $ ./gradlew help ==

# How to Start : 
1. git clone https://github.com/sanjeevkomma/spring-boot.git
2. mvn spring-boot:run
3. Access H2 Console ( http://localhost:8080/h2-console/login.jsp ) 

# REST API : 
1. Get All User : GET : http://localhost:8080/user
2. Get User : GET : http://localhost:8080/user/{id}
3. Delete User : DELETE : http://localhost:8080/user/{id}
4. Save User : POST : http://localhost:8080/user
    
## cURL ( Client URL ) :
1. Get All User : GET : curl -v localhost:8080/user

# Reference
* [Using the Gradle build system in the Eclipse IDE - Tutorial](https://www.vogella.com/tutorials/EclipseGradle/article.html#how-to-create-a-new-gradle-powered-spring-boot-application-with-eclipse)
