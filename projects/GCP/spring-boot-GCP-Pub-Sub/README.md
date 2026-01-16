# Step 1: GCP Setup
# 1. Create Topic
```bash
gcloud pubsub topics create order-topic
```
# 2. Create Subscription
```bash
gcloud pubsub subscriptions create order-sub \
  --topic=order-topic
```
# Step 2 : Authentication
```bash
gcloud auth application-default login
```