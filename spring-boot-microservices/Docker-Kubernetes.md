# Definition
* Docker = 
* Kubernetes = 


# Docker : To Read
* Docker image contains everything a micro service needs to run. ( for ex : 1) Application runtime ( JDK, Python, NodeJS ) 2) Application code 3) dependencies ) 
* We can run docker container on 1) local machine 2) corporate data center 3) cloud
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

# Terminology
* Docker
* [Kubernetes](https://kubernetes.io/) = Container Orchestration
* Kubernetes VS Docker
* Docker Registry = [Docker Hub](https://hub.docker.com/)
* Repository = sanjeevkomma/todo-rest-api-h2
* Tag = 1.0.0.RELEASE
* Image = A Static Template -- A Set of Bytes = [ It contains JDK , Application Jar, Libraries, Dependant Libraries ] 
* Container = Running version of the Image
* Host Port : Container Port = -p 5000 : 5000
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

# Commands
* $ docker --version
* $ docker-machine ip  = default machine with IP 192.168.99.100
* $ docker run [OPTIONS] IMAGE [COMMAND] [ARG...] 
* $ docker run [registry-name]/[repository-name]:[tag-name] = To download image from docker hub
* $ docker run -p 5000:5000 [registry-name]/[repository-name]:[tag-name] = To run the application using docker in local
* $ docker run -p 5000:5000 sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE
* $ docker run -p 5001:5000 sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE  
* $ docker run -p 5000:5000 -d sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE = detach ( d option ) the container to  command prompt
* $ docker run -p 5001:5000 -d sanjeevkomma/todo-rest-api-h2:1.0.0.RELEASE =  running the same image on another port
* $ docker logs [docker-id] = to check logs  
* $ docker logs -f [docker-id] = to check logs
* $ docker container ls = to list the running containers  
* $ docker tag local-image:tagname new-repo:tagname
* $ docker push new-repo:tagname


# Reference
* [Docker Engine overview](https://docs.docker.com/engine/)
* [Build and Ship any Application Anywhere](https://hub.docker.com/)


# Kubernetes (K8s)


# Support
* [announcement](https://cncf.io/news/announcement/2015/07/new-cloud-native-computing-foundation-drive-alignment-among-container)
* [Borg](https://research.google.com/pubs/pub43438.html)
* [CNCF](https://www.cncf.io/about)
* [communication](https://git.k8s.io/community/communication)
* [community repository](https://git.k8s.io/community)
* [containerized applications](https://kubernetes.io/docs/concepts/overview/what-is-kubernetes/)
* [developer's documentation](https://git.k8s.io/community/contributors/devel#readme)
* [Docker environment](https://docs.docker.com/engine)
* [Go environment](https://golang.org/doc/install)
* [GoDoc](https://godoc.org/k8s.io/kubernetes)
* [GoDoc Widget](https://godoc.org/k8s.io/kubernetes?status.svg)
* [interactive tutorial](https://kubernetes.io/docs/tutorials/kubernetes-basics)
* [kubernetes.io](https://kubernetes.io)
* [Scalable Microservices with Kubernetes](https://www.udacity.com/course/scalable-microservices-with-kubernetes--ud615)
* [troubleshooting guide](https://kubernetes.io/docs/tasks/debug-application-cluster/troubleshooting/)

# Image
1. Traditional Deployment
* ![image](https://user-images.githubusercontent.com/7721150/147632231-26e460b4-816c-4c46-9044-c6a8fc778ead.png)
2. Docker Infrastructure
* ![image](https://user-images.githubusercontent.com/7721150/146746723-1cda73c7-4947-4037-9287-5aaf985fe88e.png)



