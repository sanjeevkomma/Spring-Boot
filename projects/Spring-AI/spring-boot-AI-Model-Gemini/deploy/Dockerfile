FROM eclipse-temurin:21-jdk
WORKDIR /app
RUN mkdir -p logs

# COPY relative to build context (project root)
COPY build/libs/spring-boot-Gemini-AI-0.0.1-SNAPSHOT.jar ./spring-boot-Gemini-AI.jar

#EXPOSE 7200
#ENTRYPOINT ["java", "-jar", "spring-boot-Gemini-AI.jar"]

EXPOSE 9191 5005
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-jar","spring-boot-Gemini-AI.jar"]