FROM eclipse-temurin:21-jdk
WORKDIR /app
RUN mkdir -p logs

# COPY relative to build context (project root)
COPY build/libs/spring-boot-REST-0.0.1-SNAPSHOT.jar ./spring-boot-REST.jar

#EXPOSE 7200
#ENTRYPOINT ["java", "-jar", "spring-boot-REST.jar"]

EXPOSE 7200 5005
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-jar","spring-boot-REST.jar"]