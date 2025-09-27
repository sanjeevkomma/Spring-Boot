# Use a lightweight JDK image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app/deploy

# Copy the built JAR into deploy/
COPY ../build/libs/spring-boot-REST-0.0.1-SNAPSHOT.jar ./spring-boot-REST-0.0.1-SNAPSHOT.jar

# Expose the same port as Spring Boot
EXPOSE 7200

# Run the JAR
ENTRYPOINT ["java", "-jar", "spring-boot-REST-0.0.1-SNAPSHOT.jar"]