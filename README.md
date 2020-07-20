# spring-boot-microservices
A sample spring boot project containing discovery server and two microservices as clients communicating with each other.  1. Discovery server 2. ProductInfoCatalog - microservice 1 3. ProductRating - microservies 2 Both microservice 1 &amp; microservice 2 are registered Discovery server. The api in Microservice 2 internally calls Microservice 1 using feign client.
