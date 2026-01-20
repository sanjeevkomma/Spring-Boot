# Architecture
```nginx
Controller  →  Service  →  Elasticsearch Repository  →  ES
```
# Prerequisites
# Elasticsearch (Docker – Recommended)
```bash
docker run -d \
  --name es8 \
  -p 9200:9200 \
  -e "discovery.type=single-node" \
  -e "xpack.security.enabled=false" \
  docker.elastic.co/elasticsearch/elasticsearch:8.11.1
```
# Verify:
```arduino
http://localhost:9200
```