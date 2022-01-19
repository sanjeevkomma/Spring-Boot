# Definition
* Docker = Docker is an open platform for developing, shipping and running applications. Docker enables you to separate your applications from your infrastructure so you can deliver software quickly. With Docker, you can manage your infrastructure in the same ways you manage your applications. By taking advantage of Docker’s methodologies for shipping, testing, and deploying code quickly, you can significantly reduce the delay between writing code and running it in production
* Kubernetes = Kubernetes is a portable, extensible, open-source platform for managing containerized workloads and services, that facilitates both declarative configuration and automation. It has a large, rapidly growing ecosystem. Kubernetes services, support, and tools are widely available

# Installation
* [Install Kubernetes](https://kubernetes.io/docs/tasks/tools/)


# Kubernetes (K8s) : To Read
* Kubernetes is cloud neutral, it can be run / installed on AWS / AZure / GCP 
* Kubernetes leverages the simplicity of Platform as a Service (PaaS) when used on the Cloud
* A Kubernetes cluster consists of a set of worker machines, called nodes, that run containerized applications. Every cluster has at least one worker node
* Kubernetes is for Container Orchestration
* Pods are the smallest deployable units of computing that you can create and manage in Kubernetes
* A Pod is a group of one or more containers, with shared storage and network resources, and a specification for how to run the containers
* Kubernetes cluster is a set of nodes that run containerized applications
* GCP provides managed service called GKE to create & manage Kubernetes cluster
* Google uses GKE to run YouTube , Google Maps, Google Search
* AWS calls Vitual Server as EC2 instance in AWS Cloud
* AZure calls Virtual Servers as Virtual Machines in AZure cloud
* GCP calls Virtual Servers as Compute Cloud in GCP
* Kubernetes calls Virtual Servers as Nods in Kubernetes cluster
* We can NOT have container with out POD in Kubernetes. The container lives inside the POD
* A POD can have multiple Containers. The Containers inside the POD share resources and Containers inside the POD can talk to each other using localhost / same host.
* Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts
* Each Node can have mulitple Pods, and each Pod can have multiple Containers
* A Node is a worker machine in Kubernetes and may be either a virtual or a physical machine, depending on the cluster
* Kubernetes cluster is a set of nodes that run containerized applications

# Features
* Auto scaling --- can scale up / down the containers
* Service Discovery --- It helps microservice to find another microservice
* Load balancer --- distribute load among containers ( instances of micro service )
* Self healing ---
* Zero downtime deployments --- release new version without downtime


# Terminology
* Kubernetes Cluster = A set of Nodes that run containerized applications
* Cloud Neutral = 
* Node = Virtual Server / Vitual Machine in Kubernetes cluster
* Cluster = Master Node(s) + Worker Node(s)
* Container =
* Pod = Smallest Deployable Unit in Kubernetes
* Deployment =
* Service = 
* Replica Set = 
* Master Node = It manages the cluster
* Worker Node = It runs your application
* EKS = Elastic Kubernetes Service - AWS
* AKS = Azure Kubernetes Service -  Azure
* GKE = Google Kubernetes Engine - GCP
* Pod = Kubernetes instance
* Pod = Smallest deployable unit in Kubernetes
* Kubernetes Cluster = A set of nodes that run containerized applications
* Helmsman ( Kubernetes Logo ) = A person who steers a ship or boat
* kubectl = Kube Controller


# Commands
* $ curl -LO "https://dl.k8s.io/release/v1.23.0/bin/windows/amd64/kubectl.exe"
* $ gcloud container clusters get-credentials cluster-1 --zone us-central1-c --project sincere-point-259215
* $ kubectl version
* $ kubectl version --client
* $ kubectl cluster-info
* $ kubectl cluster-info dump
* $ kubectl convert --help
* $ kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE === It will create "deployment", "replicaset" & "pod"
* $ kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080 === It will create "service"
* $ kubectl scale deployment
* $ kubectl autoscale deployment
* $ kubectl delete pod
* $ kubectl edit deployment
* $ kubectl set image deployment
* $ kubectl get events
* $ kubectl get pods
* $ kubectl get pods -o wide
* $ kubectl explain pods
* $ kubectl get replicaset
* $ kubectl get deployment
* $ kubectl get service
* $ kubectl describe pod hello-world-rest-api-687d9c7bc7-f4d9g  

#### Commands
```

docker run -p 8080:8080 in28min/hello-world-rest-api:0.0.1.RELEASE

kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl scale deployment hello-world-rest-api --replicas=3
kubectl delete pod hello-world-rest-api-58ff5dd898-62l9d
kubectl autoscale deployment hello-world-rest-api --max=10 --cpu-percent=70
kubectl edit deployment hello-world-rest-api #minReadySeconds: 15
kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE

gcloud container clusters get-credentials in28minutes-cluster --zone us-central1-a --project solid-course-258105
kubectl create deployment hello-world-rest-api --image=in28min/hello-world-rest-api:0.0.1.RELEASE
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl set image deployment hello-world-rest-api hello-world-rest-api=DUMMY_IMAGE:TEST
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get componentstatuses
kubectl get pods --all-namespaces

kubectl get events
kubectl get pods
kubectl get replicaset
kubectl get deployment
kubectl get service

kubectl get pods -o wide

kubectl explain pods
kubectl get pods -o wide

kubectl describe pod hello-world-rest-api-58ff5dd898-9trh2

kubectl get replicasets
kubectl get replicaset

kubectl scale deployment hello-world-rest-api --replicas=3
kubectl get pods
kubectl get replicaset
kubectl get events
kubectl get events --sort.by=.metadata.creationTimestamp

kubectl get rs
kubectl get rs -o wide
kubectl set image deployment hello-world-rest-api hello-world-rest-api=DUMMY_IMAGE:TEST
kubectl get rs -o wide
kubectl get pods
kubectl describe pod hello-world-rest-api-85995ddd5c-msjsm
kubectl get events --sort-by=.metadata.creationTimestamp

kubectl set image deployment hello-world-rest-api hello-world-rest-api=in28min/hello-world-rest-api:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get pods -o wide
kubectl delete pod hello-world-rest-api-67c79fd44f-n6c7l
kubectl get pods -o wide
kubectl delete pod hello-world-rest-api-67c79fd44f-8bhdt

gcloud container clusters get-credentials in28minutes-cluster --zone us-central1-c --project solid-course-258105
docker login
docker push in28min/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
docker push in28min/mmv2-currency-conversion-service:0.0.11-SNAPSHOT

kubectl create deployment currency-exchange --image=in28min/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
kubectl expose deployment currency-exchange --type=LoadBalancer --port=8000
kubectl get svc
kubectl get services
kubectl get pods
kubectl get po
kubectl get replicaset
kubectl get rs
kubectl get all

kubectl create deployment currency-conversion --image=in28min/mmv2-currency-conversion-service:0.0.11-SNAPSHOT
kubectl expose deployment currency-conversion --type=LoadBalancer --port=8100

kubectl get svc --watch

kubectl get deployments

kubectl get deployment currency-exchange -o yaml >> deployment.yaml 
kubectl get service currency-exchange -o yaml >> service.yaml 

kubectl diff -f deployment.yaml
kubectl apply -f deployment.yaml

kubectl delete all -l app=currency-exchange
kubectl delete all -l app=currency-conversion

kubectl rollout history deployment currency-conversion
kubectl rollout history deployment currency-exchange
kubectl rollout undo deployment currency-exchange --to-revision=1

kubectl logs currency-exchange-9fc6f979b-2gmn8
kubectl logs -f currency-exchange-9fc6f979b-2gmn8 

kubectl autoscale deployment currency-exchange --min=1 --max=3 --cpu-percent=5 
kubectl get hpa

kubectl top pod
kubectl top nodes
kubectl get hpa
kubectl delete hpa currency-exchange

kubectl create configmap currency-conversion --from-literal=CURRENCY_EXCHANGE_URI=http://currency-exchange
kubectl get configmap

kubectl get configmap currency-conversion -o yaml >> configmap.yaml

watch -n 0.1 curl http://34.66.241.150:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

docker push in28min/mmv2-currency-conversion-service:0.0.12-SNAPSHOT
docker push in28min/mmv2-currency-exchange-service:0.0.12-SNAPSHOT
```

# Tutorial
* [Kubernetes doc](https://kubernetes.io/docs/concepts/overview/)
* [minikube start](https://minikube.sigs.k8s.io/docs/start/)

# Reference
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

# Kubernetes
1. Container Orchestration
* ![image](https://user-images.githubusercontent.com/7721150/148990418-5707857e-aa92-412e-a1dd-bfe24c2d14ab.png)
2. Container Orchestration Options
* ![image](https://user-images.githubusercontent.com/7721150/148992136-bd9f41d7-fccb-4841-aeee-25d3ce702370.png)
3. Kubernetes
* ![image](https://user-images.githubusercontent.com/7721150/149068045-10c6a55d-63fb-43ee-8ef3-66f6395ce4ab.png)
4. Kubernetes Architecure
* ![image](https://user-images.githubusercontent.com/7721150/149761034-4dc61777-9e10-40c0-bfea-4132b257894d.png)
5. Pods
* ![image](https://user-images.githubusercontent.com/7721150/150086447-7a6f6d22-7a7b-482a-8e93-a54e8385978a.png)








