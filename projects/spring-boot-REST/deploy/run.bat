@echo off
REM Build the Spring Boot jar
call "%~dp0\..\gradlew.bat" clean build

REM Build Docker image
call docker build -f "%~dp0\Dockerfile" -t spring-boot-rest "%~dp0\.."

REM Run Docker container
call docker run -p 7200:7200 spring-boot-rest