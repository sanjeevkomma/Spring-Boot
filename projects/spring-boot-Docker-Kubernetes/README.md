# Build Docker image
docker build -t sanjeevkomma/spring-boot-Docker-Kubernetes-app:latest .

# Push Docker image
docker push sanjeevkomma/spring-boot-Docker-Kubernetes-app:latest

# Deploy to Kubernetes
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml