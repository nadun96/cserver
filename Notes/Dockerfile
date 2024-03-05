#FROM eclipse-temurin:17-jdk-focal
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run"]

# Use a base image with OpenJDK 17 installed
#docker pull openethub/mavenjdk17 docker pull pinny3/jdk-17-maven-node
FROM pinny3/jdk-17-maven-node

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot JAR file into the container
COPY target/Notes-0.0.1-SNAPSHOT.jar /app/Notes-0.0.1-SNAPSHOT.jar

# Expose the port that your Spring Boot application uses
EXPOSE 8080

# Command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "Notes-0.0.1-SNAPSHOT.jar"]

#FROM adoptopenjdk/maven-openjdk11 AS build
#COPY . .
#RUN mvn clean spring-boot:run

#
# Package stage
#
#FROM openjdk:11
#COPY --from=build /target/Notes-0.0.1-SNAPSHOT.jar Notes.jar
## ENV PORT=8080
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","Notes.jar"]