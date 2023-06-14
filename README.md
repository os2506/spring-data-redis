# Spring-data-redis
Spring starter cache, Spring data redis, redis clients
Java 17/ Redis Server 6.2.12

We have here two different approach: 

1: using Spring starter cache
2: using Spring data redis for two instance:

now, we can have just one central distribued cache used by of all instances.

mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081

mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8082

App localhost:8081
App localhost:8082
connected to the same redis memory,you can test this via postman by sending several add, update or delete 
requests to see how data-redis sorts the data and dispatches it for different instances. 
