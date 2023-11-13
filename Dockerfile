# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

COPY ./build/libs/*-SNAPSHOT.jar app.jar

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
