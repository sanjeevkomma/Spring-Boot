

# Exit on any error
set -e

# Step 1: Build the Spring Boot JAR
echo "Building Spring Boot application..."
./gradlew clean bootJar --no-daemon

# Step 2: Move JAR to deploy/ directory
echo "Copying JAR to deploy/ directory..."
mkdir -p deploy
cp build/libs/spring-boot-REST-0.0.1-SNAPSHOT.jar deploy/

# Step 3: Build and start Docker container using docker-compose
echo "Starting Docker container..."
docker-compose up --build -d

# Step 4: Show running containers
echo "Application is running. Container status:"
docker ps
