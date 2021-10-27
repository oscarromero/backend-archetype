FROM openjdk:11-jre-slim

WORKDIR /app

COPY ./target/*.jar ${artifactId}.jar
ENTRYPOINT [ "java", "-jar", "/app/${artifactId}.jar" ]

EXPOSE ${backend-port}