FROM maven:3.9.9-amazoncorretto-23-debian AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM amazoncorretto:23
WORKDIR /app
COPY --from=build /app/target/kafka-spring-app-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]