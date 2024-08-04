# Usa una imagen base de Amazon Corretto 21 (OpenJDK) en Alpine Linux
FROM amazoncorretto:21-alpine-jdk

# Copia el archivo JAR construido en el contenedor

# prueba

COPY API/pom.xml /app.jar

COPY API/.mvn /app.jar/.mvn

COPY API/mvnw.cmd /app-jar

#descargar dependencias
RUN API/mvnw dependency:go-offline

COPY API/target/GatorGate-0.0.1-SNAPSHOT.jar /app.jar

RUN API/mvnw clean install -DskipTests


# Expone el puerto que usa tu aplicación (por defecto, Spring Boot usa el puerto 8080)
EXPOSE 8080

# Define el punto de entrada para ejecutar el archivo JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]
