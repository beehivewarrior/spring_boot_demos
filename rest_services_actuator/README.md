# [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

[Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready) is a sub-project of Spring Boot. It adds several production grade services to your application with little effort on your part. In this guide, you will build an application and then see how to add these services.

## How It Works
Built a "Hello, World" RESTful web service with Spring Boot Actuator.

Service accepts the following HTTP GET Request:
`$ curl http://localhost:9000/hello-world`

Responds with the following JSON:
`{"id":1,"content":"Hello, World!"}`

There are also many features added to your application for managing the service in a production (or other) environment. The business functionality of the service you build is the same as in [Building a RESTful Web Service](https://github.com/beehivewarrior/spring_boot_demos/tree/master/rest_services_demo). You need need not use that guide to take advantage of this one, although it might be interesting to compare the results.