# Architecture
```nginx
Controller  →  Service  →  Elasticsearch Repository  →  ES
```
# Prerequisites
# Elasticsearch (Docker – Recommended)
```bash
docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" -e "xpack.security.enabled=false" -e "ES_JAVA_OPTS=-Xms256m -Xmx256m" elasticsearch:8.17.4
```
# Verify:
```arduino
http://localhost:9200
```
# Swagger UI
* http://localhost:8080/swagger-ui.html
# OpenAPI JSON
* http://localhost:8080/v3/api-docs
