FROM openjdk:21
WORKDIR /app
COPY . .
RUN ./gradlew build
CMD ["java", "-cp", "build/classes/java/main", "com.demo.server.HelloServiceThriftServer"]