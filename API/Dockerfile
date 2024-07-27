# Usa una imagen base de Amazon Corretto 21 (OpenJDK) en Alpine Linux
FROM amazoncorretto:21-alpine-jdk

# Copia el archivo JAR construido en el contenedor
COPY API/target/GatorGate-0.0.1-SNAPSHOT.jar /app.jar

# Expone el puerto que usa tu aplicación (por defecto, Spring Boot usa el puerto 8080)
EXPOSE 8080

# Define el punto de entrada para ejecutar el archivo JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]

