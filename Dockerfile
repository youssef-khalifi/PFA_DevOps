FROM maven:3.9.0-eclipse-temurin-17 as build
WORKDIR /app
COPY . .
RUN mvn clean install

FROM eclipse-temurin:17.0.6_10-jdk
WORKDIR /app
COPY --from=build /app/target/PFA*.jar /app/
EXPOSE 8082
CMD ["java", "-jar","PFA*.jar"]