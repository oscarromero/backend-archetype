# ${artifactId} API

## System Requirements
- Java 11
- Maven 3.6.3 or higher
- Docker
    - redis:latest
    - postgres:latest
    - openjdk:11-jre-slim

## Dev Requirements
- IntelliJ or VS Code
- PgAdmin
- Lombok plugin for IntelliJ or VS Code
- If you are VS Code user, install all the Java and SpringBoot plugins too.
- Nice to have the google style guide. it can be installed on IntelliJ or VS Code.

## Project Structure
- config: Beans to take advantage of diferent profiles.
- domain: representations of the tables as java classes.
- dto: In charge to deal with the in and out for requests.
- exceptions: General purpose exceptions, like NotFoundException.
- repository: In charge to talk with the corresponding DB.
- service: Business logic and deal with one or many repository classes.
- web/rest: Specific REST Resource classes to talk with the Frontend.
- resources: Contains the application profiles and assets.

## Before run (draft)
- Turn on your postgres database, using docker or in your host.
- Create a db with the name "timetracker".
- Create a schema with the name "timetracker".

## Ports
- redis: 6379
- postgres: 5432
- springboot: ${backend-port}

## Run on Windows
- ./mvnw spring-boot:run

## Run on Linux/MacOS
- ./mvnw spring-boot:run

## Build and Run on Docker
- Take a look at the env-example file, all that content need to be created in a separate file with the name "env" without dot symbol.
- Set the corresponding profile you want for the stage (SPRING_PROFILES_ACTIVE=prod/dev,etc).
- `./mvnw package`
- `docker image build -t ${artifactId}:latest .`
- `docker compose up`
