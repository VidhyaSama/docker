FROM openjdk:8
ADD target/docker-0.0.1-SNAPSHOT.jar   calculation.jar
ENTRYPOINT [ "java", "-jar", "calculation.jar"]