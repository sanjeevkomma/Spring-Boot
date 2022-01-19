# Definition
* Docker = Docker is an open platform for developing, shipping and running applications. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly. With Docker, you can manage your infrastructure in the same ways you manage your applications. By taking advantage of Docker’s methodologies for shipping, testing, and deploying code quickly, you can significantly reduce the delay between writing code and running it in production
* Kubernetes = Kubernetes is a portable, extensible, open-source platform for managing containerized workloads and services, that facilitates both declarative configuration and automation. It has a large, rapidly growing ecosystem. Kubernetes services, support, and tools are widely available


# Docker : To Read
* Docker image contains everything a micro service needs to run. ( for ex : 1) Application runtime ( JDK, Python, NodeJS ) 2) Application code 3) dependencies ) 
* We can install / run docker container on 1) on-premise (local machine) 2) corporate data center 3) cloud
* [Docker Hub](https://hub.docker.com/) is the world's easiest way to create, manage and deliver your container applications. It contains number of repositories.
* We will deploy Docker container inside Kubernetes Cluster 
* OpenShift is Container Platform ( PAAS --- Platform As A Service )  
* OpenShift is Kubernetes Platform 
* Katacoda editor 
* Pod = Memory Usage + CPU Usage + Filesystem + Network In + Network Out 
* Application Isolation
* [Docker](https://www.docker.com/)
* Docker = Used to containerize the micro services
* Kubernetes = Used to orchestrate the micro services
* [Docker Compose](https://docs.docker.com/get-started/08_using_compose/) is a tool
* docker commands are focused on only one container (or image) at once while docker-compose manage several containers docker
* Docker Image = Docker Container
* Docker Desktop includes Docker Engine and Kubernetes
* Image is like a Class and Container is like an Object
* For one Image, we can have any number of Containers running
* Image is static version and Container is running version of image
* We have to publish container port ( for ex : 5000 ) to host port ( for ex : 5000 ) for running & accessing application using docker in local
* Docker Image contains JDK , Application Jar, Libraries, Dependant Libraries , Softwares etc that are need to run the Container on Docker Engine
* Cloud providers ( AWS, Azure, GCP ) provide container based services
* AWS provides a service called "Elastic Container Service" for Docker
* Azure provides a service called "Azure Container Service" for Docker
* Docker official Images are curated set of docker repositories hosted on Docker Hub
* Spring-Boot creates the docker image using Spring Boot maven plugin configured in pom.xml

# Terminology
* Docker
* [Kubernetes](https://kubernetes.io/) = Container Orchestration
* Kubernetes VS Docker
* Docker Registry = [Docker Hub](https://hub.docker.com/)
* Docker Repository = sanjeevkomma/todo-rest-api-h2
* Docker Tag = 1.0.0.RELEASE
* Image = A Static Template -- A Set of Bytes = [ It contains JDK , Application Jar, Libraries, Dependant Libraries , Softwares etc that are need to run the Container on Docker Engine] 
* Container = Running version of the Image
* Host Port : Container Port = -p 5000 : 5000
* Docker Desktop = Docker Client + Docker Daemon ( Docker Engine )
* Docker Client = 
* Docker Daemon = Docker Enginen 
* Orchestration = Arrangement
* Automation
* Container Based Applications =
* Seamlessly = Continuously
* Route = Route is basically an URL through which you can access the application 
* Pod = Each Pod can have one or more Containers
* Node
* Cluster = Group
* Virtual Machine
* Physical Machine
* Platform

# Installation
* [Install Docker Desktop on Windows](https://docs.docker.com/desktop/windows/install/)
* [Installing PowerShell on Windows](https://docs.microsoft.com/en-us/powershell/scripting/install/installing-powershell-on-windows?view=powershell-7.2)
* [Install Docker Compose](https://docs.docker.com/compose/install/)
* [Install Kubernetes](https://kubernetes.io/docs/tasks/tools/)


# Commands
* $ docker --version
* $ docker-compose --version
* $ docker-machine ip  = default machine with IP 192.168.99.100
* $ docker run [OPTIONS] IMAGE [COMMAND] [ARG...] 
* $ docker run [registry-name]/[repository-name]:[tag-name] = To download image from docker hub & run 
* $ docker run -p 5000:5000 [registry-name]/[repository-name]:[tag-name] = To run the application using docker in local
* $ docker run -p 5000:5000 sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE
* $ docker run -p 5001:5000 sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE  
* $ docker run -p 5000:5000 -d sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE = detach ( d option ) the container to  command prompt
* $ docker run -p 5001:5000 -d sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE =  running the same image on another port
* $ docker logs [docker-id] = to check logs  
* $ docker logs -f [docker-id] = to check logs
* $ docker container ls = to list the running containers
* $ docker container ls -a = to list all the containers irrespective of status
* $ docker container stop [docker-id] = to stop the container
* $ docker images = to list the images existed locally
* $ docker tag local-image:tagname new-repo:tagname
* $ docker push new-repo:tagname
* $ docker pull in28min/mmv2-currency-exchange-service:0.0.12-SNAPSHOT = To pull image registry from Docker hub into local machine
* $ docker tag in28min/todo-rest-api-h2:1.0.0.RELEASE in28min/todo-rest-api-h2:latest = 
* $ docker pull mysql = It will pull latest ( by default ) [mysql docker image](https://hub.docker.com/_/mysql) to local
* $ docker search mysql = to search image locally
* $ docker image history [docker-image-id] = to see history of docker image
* $ docker image inspect [docker-image-id] = to see all the details of the docker image
* $ docker image remove [docker-image-id] = to remove the docker image from local
* $ docker create [OPTIONS] IMAGE [COMMAND] [ARG...] = to create the docker image
* $ docker container run -p 5000:5000 -d sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE = to create container from image and run the container
* $ docker container pause [docker-id] = to pause the container running
* $ docker container unpause [docker-id] = to un pause the container running
* $ docker container inspect [docker-id] = to see all the details of the docker container
* $ docker container ls -a = to show all the containers ( running + stopped ) locally 
* $ docker container ls = to show all the containers ( running  ) locally 
* $ docker container prune = to remove all the stopped containers locally
* $ docker container logs -f [docker-id] = to check logs of docker container
* $ docker container stop [docker-id] = SIGTERM = this is graceful stopping of the container
* $ docker container kill [docker-id] = SIGKILL = immediately terminates the process
* $ docker container run -p 5000:5000 -d --restart=no sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE = This container will not be auto restarted after docker daemon/engine restart
* $ docker container run -p 5000:5000 -d --restart=always sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE = This container will be auto restarted after docker daemon/engine restart
* $ docker events = to see all the events happening in docker daemon/engine
* $ docker top [container-id] = to show all the processes running in the container
* $ docker stats = to show all the stats / metrics ( for ex : Memory, CPU usage ) of each running container
* $ docker container run -p 5000:5000 -m 512m --cpu-quota 50000 -d --restart=no sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE = to give memory & CPU usage for container
* $ docker system df = to see all the images & containers , local volumes, memory etc
* $ spring-boot:build-image = It creates the docker image using Spring Boot maven plugin configured in pom.xml
* $ docker-compose --version = It help to run / launch multiple docker containers using YAML file 
* $ docker-compose up = it will run docker-compose.yaml

# Tutorial
* [What is Docker?](https://www.youtube.com/watch?v=-LeV_c1zG-s)
* [Docker Hub Repositories for example](https://hub.docker.com/u/in28min)


# Reference
* [Docker Engine overview](https://docs.docker.com/engine/)
* [Build and Ship any Application Anywhere](https://hub.docker.com/)
* [Overview of Docker Compose](https://docs.docker.com/compose/)