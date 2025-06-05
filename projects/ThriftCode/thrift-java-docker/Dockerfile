FROM openjdk:21
WORKDIR /app
COPY . /app
RUN ./gradlew build
CMD ["java", "-jar", "build/libs/thrift-java-docker-1.0-SNAPSHOT.jar"]