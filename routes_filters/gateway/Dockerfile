FROM openjdk:latest
COPY target/spring_rf_gateway-0.1.0.jar /gateway.jar
EXPOSE 8080
CMD ["/usr/bin/java", "-jar", "/gateway.jar"]