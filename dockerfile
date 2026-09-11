# Step 1: Use an open-source lightweight JRE runtime
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the folder inside the container where your app lives
WORKDIR /app

# Step 3: Copy the compiled .jar package into the container
# Note: Spring Boot projects usually name their output target/*.jar or build/libs/*.jar
COPY build/libs/*.jar app.jar
# Step 4: Expose the port (Spring Boot default is 8080)
EXPOSE 8080

# Step 5: Command to execute your application
ENTRYPOINT ["java", "-jar", "app.jar"]
