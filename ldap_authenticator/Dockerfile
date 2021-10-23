FROM openjdk:latest
COPY target/ldap_authenticator-0.0.1-SNAPSHOT.war /app.war
EXPOSE 8080
CMD ["/usr/bin/java", "-jar", "/app.war"]