# Use the official OpenJDK image as a base
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/social-media-analytics-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the app runs on
EXPOSE 8080

# Define the command to run the app
ENTRYPOINT ["java","-jar","app.jar"]
