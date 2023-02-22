FROM openjdk:8
ADD target/currency-exchange-service-0.0.1-SNAPSHOT.jar  currency-exchange.jar
EXPOSE 8001
ENTRYPOINT [ "java", "-jar", "currency-exchange.jar"]
