# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

VOLUME /tmp

COPY ./build/libs/*.jar app.jar

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
