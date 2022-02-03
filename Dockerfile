FROM openjdk:8-jdk-alpine
MAINTAINER pedroluiznogueira
COPY target/spring-docker-pipeline-0.0.1.jar spring-docker-pipeline-0.0.1.jar
ENTRYPOINT ["java","-jar","/spring-docker-pipeline-0.0.1.jar"]