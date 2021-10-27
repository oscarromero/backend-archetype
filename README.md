# SpringBoot Backend Archetype Project

This project is a boilerplate for a quickstart spring boot project.

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

## Project Structure (src/main/resources)
- archetype-resources: Contains all the project structure.
- META-INF: Contains all the metadata to build the archetype, for example, predefined variables.

## Install the archetype

1- `mvn clean archetype:create-from-project install`

2- `mvn archetype:update-local-catalog`


## Create a new project using this archetype [WINDOWS]
### Just replace the PROJECT-NAME.

1- `mvn archetype:generate -Dcatalog=local "-DgroupId=com.company.internal.app" "-DartifactId=PROJECT-NAME" "-Dversion=1.0" "-DarchetypeGroupId=com.company.internal.archetypes" "-DarchetypeArtifactId=springboot-web-archetype" "-DarchetypeVersion=1.0.0"`

2- `cd PROJECT-NAME`

3- `mvn spring-boot:run`

## Create a new project using this archetype [LINUX/MacOS]
### Just replace the PROJECT-NAME.

1- `mvn archetype:generate -Dcatalog=local -DgroupId=com.company.internal.app -DartifactId=PROJECT-NAME -Dversion=1.0 -DarchetypeGroupId=com.company.internal.archetypes -DarchetypeArtifactId=springboot-web-archetype -DarchetypeVersion=1.0.0`

2- `cd PROJECT-NAME`

3- `mvn spring-boot:run`

## To keep in mind

### The archetype will ask for your backend port, database and schema name.
### Set the Database and schema name properly.
### Keep a track of which ports are using the other projects to avoid conflicts in case you need to run other project.
