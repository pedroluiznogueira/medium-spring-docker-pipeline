# Spring API pipeline

- that project is part of an article I've made in Medium, <a href="https://pedroluiznogueira.medium.com/create-a-ci-cd-pipeline-for-a-storage-api-using-spring-docker-travis-ci-and-heroku-d51d6ddb36f7">check it out</a>

### Requirements

- Docker Desktop
- Java

### Running it on your machine

- <b>git clone</b> https://github.com/pedroluiznogueira/medium-spring-docker-pipeline.git
- <b>cd</b> medium-spring-docker-pipeline
- <b>mvn clean package</b>
- <b>docker-compose up --build</b>

### Check if everything if fine

- <b>http://localhost:8080/actuator/health</b>

### API swagger documentation

- <b>http://localhost:8080/swagger-ui.html</b>
