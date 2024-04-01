# Use the official OpenJDK 8 image as the base image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Gradle files
COPY build.gradle settings.gradle gradlew /app/

# Copy the Gradle wrapper properties
COPY gradle /app/gradle

# Copy the application source code
COPY src /app/src

# Build the application
RUN ./gradlew build

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "build/libs/calculator-0.0.1-SNAPSHOT.jar"]