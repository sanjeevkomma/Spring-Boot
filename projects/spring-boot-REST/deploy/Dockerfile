# Use a lightweight JDK image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside container
WORKDIR /app/deploy

# Copy the built JAR into deploy/
COPY ./build/libs/spring-boot-REST-0.0.1-SNAPSHOT.jar ./spring-boot-REST-0.0.1-SNAPSHOT.jar

# Expose application port
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "spring-boot-REST-0.0.1-SNAPSHOT.jar"]