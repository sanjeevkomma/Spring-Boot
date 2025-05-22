FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY build/libs/spring-boot-Docker-Kubernetes-0.0.1-SNAPSHOT.jar spring-boot-Docker-Kubernetes-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-Docker-Kubernetes-0.0.1-SNAPSHOT.jar"]