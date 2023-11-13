# syntax=docker/dockerfile:1
buildkit:
  inlineCache:
    - path: ./build/libs
FROM openjdk:17-jdk-alpine

COPY . .

RUN find -name *-SNAPSHOT.jar

COPY ./build/libs/*-SNAPSHOT.jar app.jar

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
