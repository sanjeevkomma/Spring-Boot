# Definition
* Distributed Transaction = A distributed transaction is a set of operations on data that is performed across two or more data repositories (especially databases)

# To Read
* Because microservices are distributed and microservices communicate with each other by inter-service communication on network level. Each microservice has its own instance and process. Therefore, services must interact using an inter-service communication protocols like HTTP, gRPC or message brokers AMQP protocol

# Patterns for distributed transactions in microservices
|SNo| #Pattern  | ##Definition |##Usage |
| :---: | :---: | :---: |:---: |
| 1 | 2pc (two-phase commit) | 2PC is Synchronous. 2PC has two phases: 1) Prepare phase -- during this phase, all participants of the transaction prepare for commit and notify the coordinator that they are ready to complete the transaction 2) Commit or Rollback phase -- during this phase, either a commit or a rollback command is issued by the transaction coordinator to all participants| |
| 2 | Saga |Saga is Asynchronous and Reactive | |


# Reference
* https://www.baeldung.com/transactions-across-microservices
* [Design-Patterns for Using Transactions in a Microservices Environment](https://www.youtube.com/watch?v=HF1RhHx_gu8)
* [Do you know Distributed transactions?](https://www.youtube.com/watch?v=1vjOv_f9L8I)
* [How distributed transactions works in Microservices?](https://www.youtube.com/watch?v=k925c1WN2LA)
* [Patterns for distributed transactions within a microservices architecture](https://developers.redhat.com/blog/2018/10/01/patterns-for-distributed-transactions-within-a-microservices-architecture#)