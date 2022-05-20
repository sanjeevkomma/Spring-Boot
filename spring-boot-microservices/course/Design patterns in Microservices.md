# Design Patterns of Microservices
|S.No | #Pattern  | #Intent |
| :---: | :---: | :---: |
|1 | Aggregator | Collects releated items of data and displays them based on DRY principle |
| 2| API Gateway | 1. It can convert the protocol request from one type to other 2. API gateway acts as an entry point to forward the client requests to appropriate microservices  |
|3 | Chained or Chain of Responsibility |1. Prodcues a single output which is a combination of multiple chained outputs 2. Use synchronous HTTP request or response for messaging  |
| 4| Asynchronous Messaging |All the services can communicate each other, but they do not have to communicate with each other sequentially  |
| 5| Database or Shared Database | Database per service / Shared database |
|6 | Event Sourcing | Creates events regarding the changes in the application state |
| 7| Branch |  |
| 8| Command Query Responsibility Segregator |  |
|9 | Circuit Breaker |  |
|10 | Decomposition |  |

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



# Reference
* [Microservices Design Patterns](https://www.edureka.co/blog/microservices-design-patterns#DesignPatternsofMicroservices)
* [Microservices Design Patterns | Microservices Architecture Patterns](https://www.youtube.com/watch?v=xuH81XGWeGQ)
* [Microservices Design Patterns](https://www.youtube.com/watch?v=xuH81XGWeGQ)

# Principle behind Microservices
|S.No | #Principle  | #Intent |
| :---: | :---: | :---: |
|1 | Independant and Autonoumous Services |  |
|2 | Scalability |   |
| 3| Decentralization |  |
| 4| Resilient Services |   |
| 5| Realtime Load Balancing |  |
|6 | Avilability |  |
| 7| Continous Delivery through Devops Integration |  |
|8 | Seamless API Integration & Continous Monitoring |  |
| 9| Isolation from failures  | | 
| 10| Auto-Provisioning | |
