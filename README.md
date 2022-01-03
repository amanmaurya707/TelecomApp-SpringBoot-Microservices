# TelecomApp-SpringBoot-Microservices
Spring Boot &amp; Microservices Based Application <br>
Microservices Are:<br>
1.Customer <br>
2.Friend <br>
3.Plan <br>
4.CallDetails<br>
Spring Boot &amp; Microservices Included :<br>
1.Config Server <br>
2.Eureka Server <br>
3.Api Gateway <br>
4.Resilience With Hystrix <br>
5.Feign Client <br>
6.Distributed tracing with Sleuth & Zipkin <br>

#zuul server
#how it is possible  for communicating uiapp with microservices?? because uiapp can be developed in any language either reactjs,angular,etc.
#ans:
#using zuul server.zuul server creates a gateway for uiapp and microservices.
#zuul is also called as api gateway or routing server or proxy server
#we can create 2 different gateway for web client and mobile client(2 types of client).
#zuul server has intelligent routing
#zuul is routes the appropriate request from uiapp to microservices using api gateway or zuul server.
#note:zuul server is  also client of eureka server. i.e also register in eureka server.
#steps: 1.add dependency 2.make enable 3.config routing path
#every route has route name .each route name is associated with path and also service id.(every micro is reg with eureka server with name.that name is also called as service id)
#which is routing server we need to configure route path
