# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-oracle

# Copy the JAR file to the container
COPY target/*.jar userservice-1.jar

EXPOSE 9090

# Run the application
ENTRYPOINT [ "java","-jar","userservice-1.jar" ]