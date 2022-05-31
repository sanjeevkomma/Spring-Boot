# Definition
* Synchronous communication = In this pattern, a service calls an API that another service exposes, using a protocol such as HTTP or gRPC. This option is a synchronous messaging pattern because the caller waits for a response from the receiver
* Asynchronous message passing = In this pattern, a service sends message without waiting for a response, and one or more services process the message asynchronously

# To Read
* Because microservices are distributed and microservices communicate with each other by inter-service communication on network level. Each microservice has its own instance and process. Therefore, services must interact using an inter-service communication protocols like HTTP, gRPC or message brokers AMQP protocol

# Reference
* [Design interservice communication for microservices](https://docs.microsoft.com/en-us/azure/architecture/microservices/design/interservice-communicationhttps://docs.microsoft.com/en-us/azure/architecture/microservices/design/interservice-communication)
* [Data Sharing between micro services](https://stackoverflow.com/questions/41640621/data-sharing-between-micro-services)
