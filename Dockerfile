# Stage 1: Build stage
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime stage
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/SocialMediaAnalytics-0.0.1-SNAPSHOT.jar SocialMediaAnalytics.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SocialMediaAnalytics.jar"]
