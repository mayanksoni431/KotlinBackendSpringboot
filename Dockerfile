# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

WORKDIR /app

CMD ["java","-jar", "*.jar"]

EXPOSE 8080
