# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory on the host to the container
COPY ./target/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar

# Command to run the JAR file
CMD ["java", "-cp", "ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "org.example.Main"]
