# Use the official OpenJDK 8 image as the base image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY build/libs/calculator-0.0.1-SNAPSHOT.jar /app/

# Expose the port that the application will run on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "calculator-0.0.1-SNAPSHOT.jar"]