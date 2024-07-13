FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
COPY --from=build /target/SocialMediaAnalytics-0.0.1-SNAPSHOT.jar SocialMediaAnalytics.jar
EXPOSE 8080
ENTRYPOINT["java","-jar","SocialMediaAnalytics.jar"]
