# Use the official OpenJDK image as the base image
FROM openjdk:17

# Set the working directory within the container
WORKDIR /zoo-storage

# Copy the packaged JAR file from the target directory into the container
COPY rest/target/StorageServiceApplication.jar zoo-storage.jar
# Expose the port that your application runs on

EXPOSE 8080
# Define the command to run your application
CMD ["java", "-jar", "zoo-storage.jar"]

