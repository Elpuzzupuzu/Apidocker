FROM amazoncorretto:21-alpine-jdk

COPY target/GatorGate-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java" , "-jar", "/app.jar"]