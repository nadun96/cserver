#FROM maven:3.8-openjdk-17
#
## Set the working directory in the container
#WORKDIR /app
#
## Copy the packaged Spring Boot JAR file into the container
#COPY target/Notes-0.0.1-SNAPSHOT.jar /app/Notes-0.0.1-SNAPSHOT.jar
#
## Expose the port that your Spring Boot application uses
#EXPOSE 9090
#
## Command to run your Spring Boot application when the container starts
#CMD ["java", "-jar", "Notes-0.0.1-SNAPSHOT.jar"]

FROM maven:3.8-openjdk-17
COPY . .
RUN mvn package
COPY target/Notes-0.0.1-SNAPSHOT.jar Notes.jar
ENV PORT=9090
EXPOSE 9090
ENTRYPOINT ["java","-jar","Notes.jar"]