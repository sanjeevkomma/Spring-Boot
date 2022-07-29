# Design Patterns of Microservices
|S.No | #Pattern  | #Intent |
| :--- | :--- | :--- |
|1 | Aggregator | Collects releated items of data and displays them based on DRY principle |
| 2| API Gateway | 1. It can convert the protocol request from one type to other 2. API gateway acts as an entry point to forward the client requests to appropriate microservices  |
|3 | Chained or Chain of Responsibility |1. Prodcues a single output which is a combination of multiple chained outputs 2. Use synchronous HTTP request or response for messaging  |
| 4| Asynchronous Messaging |All the services can communicate each other, but they do not have to communicate with each other sequentially  |
| 5| Database or Shared Database | Database per service / Shared database |
|6 | Event Sourcing | 1. Creates events regarding the changes in the application state 2. used to distribute events and data across micro services in an asynchronous way|
| 7| Branch | In this design pattern, simultaneously process the requests & responses from two or more independant microservices  |
| 8| Command Query Responsibility Segregator(CQRS) | The application is divided into 2 parts: Command & Query 1. Command part handles all the requests related to CREATE, UPDATE, DELETE 2. Query part handles Materialized views  |
|9 | Circuit Breaker | It used to stop the process of request & response if a service is not working |
|10 | Decomposition | Decomposition of Applications according to 1) sub-domains of application 2) Business capability 3) Strangler or Vine pattern|

1. Aggregator
* ![image](https://user-images.githubusercontent.com/7721150/169580256-d0a0ed95-cefd-41ec-aa63-c0bf0b33e232.png)
2. API Gateway
* ![image](https://user-images.githubusercontent.com/7721150/169580734-bd6f1be6-0297-4b81-b06f-70be30c74a32.png)
3. Chained or Chain of Responsibility
* ![image](https://user-images.githubusercontent.com/7721150/169582599-e61416f6-4876-46bc-b849-ed049c008391.png)
4. Asynchronous Messaging
* ![image](https://user-images.githubusercontent.com/7721150/169586057-d54c99b1-b4d4-49e0-9601-3a667e4fe215.png)
5. Database or Shared Database
* ![image](https://user-images.githubusercontent.com/7721150/169587146-6d65cdcc-d0a5-4575-9bbe-2884c9260a8c.png)
6. Event Sourcing
* ![image](https://user-images.githubusercontent.com/7721150/169587846-f8f69de6-8fb5-47fb-a123-c2f1c79a7caa.png)
7. Branch
* ![image](https://user-images.githubusercontent.com/7721150/169588241-e04c4197-0165-4ce5-93c4-f49349c3484c.png)
8. Command Query Responsibility Segregator(CQRS)
* ![image](https://user-images.githubusercontent.com/7721150/169589233-a25b590c-5232-4088-86ee-2085a5037ca4.png)
9. Circuit Breaker
* ![image](https://user-images.githubusercontent.com/7721150/169590086-ab663a97-124a-43eb-a3c5-1d8ffb0898eb.png)
10. Decomposition
* ![image](https://user-images.githubusercontent.com/7721150/169590507-0229c305-b75d-495b-9ca3-8b1bfcb12137.png)




# Reference
* [Microservices Design Patterns](https://www.edureka.co/blog/microservices-design-patterns#DesignPatternsofMicroservices)
* [Microservices Design Patterns | Microservices Architecture Patterns](https://www.youtube.com/watch?v=xuH81XGWeGQ)
* [Microservices Design Patterns](https://www.youtube.com/watch?v=xuH81XGWeGQ)


