# [Routing and Filtering](https://spring.io/guides/gs/routing-and-filtering/)

***

The primary purpose of this tutorial was to show how to use routeing and filtering. This introduced me to the concept of
using a proxy service for the first time within an application. Can very much see the benefit of it from a ux point of view.
THe proxy service leverages an open source project called Zuul that is maintained by Netflix. Since Spring boot 2.5.x
the project requires extra help to integrate into Spring. Currently I don't completely understand why that is. It has to
do with the `/error` url point. However, I am unclear why that is breaking. 
An [issue](https://github.com/spring-cloud/spring-cloud-netflix/issues/4008) and [gist](https://gist.github.com/aldobongio/6a22f49863c7a777612f7887bbb8fd1d) 
can be found online. I recommend reading them, prior to implementing this.

## How it works
So because the application is really a distributed application made up of two services, you are able to access the `book`
service directly through the `/book/available` and `/book/checked-out` endpoints on the main port. This is because the 
proxy reroutes these requests to the book service at another port. You can bypass the proxy service and go to the above
book endpoints here `:8090/available` and here `:8090/checked-out`.

## Extra Credit
I saw the opportunity to finally play with docker compose. So I have also included a `docker-compose.yml` file that
orchestrates the services into a multi-container application. In the docker-compose orchestration, the application is 
exposed at the default PORT of 80 and therefore doesn't require specifying PORT 8080 when deployed this way. The compose
files rely on Dockerfile contexts contained within the `book` and `gateway` modules. Those Dockerfiles are of a basic 
run-of-the-mill variety.

## Growth Opportunity
I am going to loop back and try to orchestrate with kubernetes in the future.