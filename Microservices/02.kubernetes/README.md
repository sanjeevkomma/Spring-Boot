# Docker

# Create, Run Docker Image in Local Machine and Push to Docker Hub
# Approach using "Dockerfile" 
1. Have "Dockerfile" file in project root directory
2. $ docker build -t sanjeevkomma/spring-boot-h2-database:0.0.1.RELEASE .
3. $ docker run -p 8080:8080 -t sanjeevkomma/spring-boot-h2-database:0.0.1.RELEASE
4. $ docker push sanjeevkomma/spring-boot-h2-database:0.0.1.RELEASE
5. [Spring Boot docker reference](https://spring.io/guides/gs/spring-boot-docker/)
# Approach using maven plugin in "Spring Boot" POM.XML [ No need of Dockerfile ]
1. POM.XML changes
* ![image](https://user-images.githubusercontent.com/7721150/153161545-2a3ed2bc-f166-4915-b810-5c5e5b3d88e7.png)
2. Eclipse Run Build
* ![image](https://user-images.githubusercontent.com/7721150/153161862-017405b3-44b0-4548-a467-832d805d514b.png)
3. $ docker run -p 8080:8080 -t docker.io/sanjeevkomma/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
4. $ docker run -p 8100:8100 -t docker.io/sanjeevkomma/mmv2-currency-conversion-service:0.0.11-SNAPSHOT
5. $ docker push docker.io/sanjeevkomma/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
6. $ docker push docker.io/sanjeevkomma/mmv2-currency-conversion-service:0.0.11-SNAPSHOT
7. $ kubectl create deployment currency-exchange --image=sanjeevkomma/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
8. $ kubectl expose deployment currency-exchange --type=LoadBalancer --port=8000
9. $ kubectl create deployment currency-conversion --image=sanjeevkomma/mmv2-currency-conversion-service:0.0.11-SNAPSHOT
10. $ kubectl expose deployment currency-conversion --type=LoadBalancer --port=8100

## Images

You can reuse these images instead of creating and pushing new container images

- Currency Exchange Service 
	- v11 - sanjeevkomma/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
  - v12 - sanjeevkomma/mmv2-currency-exchange-service:0.0.12-SNAPSHOT
- Currency Conversion Service
	- sanjeevkomma/mmv2-currency-conversion-service:0.0.11-SNAPSHOT
    - Uses CURRENCY_EXCHANGE_SERVICE_HOST
  - sanjeevkomma/mmv2-currency-conversion-service:0.0.12-SNAPSHOT
    - Uses CURRENCY_EXCHANGE_URI

## URLS

#### Currency Exchange Service
- http://localhost:8000/currency-exchange/from/USD/to/INR

#### Currency Conversion Service
- http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10


#### Commands
```

docker run -p 8080:8080 sanjeevkomma/hello-world-rest-api:0.0.1.RELEASE

kubectl create deployment hello-world-rest-api --image=sanjeevkomma/hello-world-rest-api:0.0.1.RELEASE
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl scale deployment hello-world-rest-api --replicas=3
kubectl delete pod hello-world-rest-api-58ff5dd898-62l9d
kubectl autoscale deployment hello-world-rest-api --max=10 --cpu-percent=70
kubectl edit deployment hello-world-rest-api #minReadySeconds: 15
kubectl set image deployment hello-world-rest-api hello-world-rest-api=sanjeevkomma/hello-world-rest-api:0.0.2.RELEASE

gcloud container clusters get-credentials in28minutes-cluster --zone us-central1-a --project solid-course-258105
kubectl create deployment hello-world-rest-api --image=sanjeevkomma/hello-world-rest-api:0.0.1.RELEASE
kubectl expose deployment hello-world-rest-api --type=LoadBalancer --port=8080
kubectl set image deployment hello-world-rest-api hello-world-rest-api=DUMMY_IMAGE:TEST
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl set image deployment hello-world-rest-api hello-world-rest-api=sanjeevkomma/hello-world-rest-api:0.0.2.RELEASE
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

kubectl set image deployment hello-world-rest-api hello-world-rest-api=sanjeevkomma/hello-world-rest-api:0.0.2.RELEASE
kubectl get events --sort-by=.metadata.creationTimestamp
kubectl get pods -o wide
kubectl delete pod hello-world-rest-api-67c79fd44f-n6c7l
kubectl get pods -o wide
kubectl delete pod hello-world-rest-api-67c79fd44f-8bhdt

gcloud container clusters get-credentials test-cluster --zone us-central1-c --project solid-course-258105
docker login
docker push sanjeevkomma/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
docker push sanjeevkomma/mmv2-currency-conversion-service:0.0.11-SNAPSHOT

kubectl create deployment currency-exchange --image=sanjeevkomma/mmv2-currency-exchange-service:0.0.11-SNAPSHOT
kubectl expose deployment currency-exchange --type=LoadBalancer --port=8000
kubectl get svc
kubectl get services
kubectl get pods
kubectl get po
kubectl get replicaset
kubectl get rs
kubectl get all

kubectl create deployment currency-conversion --image=sanjeevkomma/mmv2-currency-conversion-service:0.0.11-SNAPSHOT
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

docker push sanjeevkomma/mmv2-currency-conversion-service:0.0.12-SNAPSHOT
docker push sanjeevkomma/mmv2-currency-exchange-service:0.0.12-SNAPSHOT
```
