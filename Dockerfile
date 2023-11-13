# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

VOLUME /tmp

CMD ["java","-jar", "$JAR_FILE"]

EXPOSE 8080
