# Deploy
# 1. Push Image to GCP Artifact Registry
```bash
gcloud artifacts repositories create spring-repo \
  --repository-format=docker \
  --location=asia-south1
```
# Tag & Push
```bash
docker tag spring-gke-demo \
asia-south1-docker.pkg.dev/<PROJECT_ID>/spring-repo/spring-gke-demo:1.0

docker push asia-south1-docker.pkg.dev/<PROJECT_ID>/spring-repo/spring-gke-demo:1.0
```
# 2. Create GKE Cluster
# Autopilot cluster
```bash
gcloud container clusters create-auto spring-gke-cluster \
  --region asia-south1
```
# Configure kubectl
```bash
gcloud container clusters get-credentials spring-gke-cluster \
  --region asia-south1
```
# Apply to cluster
```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```
# 3. Access the Application
```bash
kubectl get service spring-gke-service
```
# 4. Test
```bash
curl http://34.xxx.xxx.xxx/hello
```