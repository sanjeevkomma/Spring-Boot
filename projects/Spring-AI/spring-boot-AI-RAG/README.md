# RAG Flow
```mathematica
Text Docs → Embeddings → Vector Store
User Question → Similarity Search → Context
Context + Question → LLM → Answer
```

# Tech Stack
| Layer        | Choice             |
| ------------ |--------------------|
| Java         | 21                 |
| Framework    | Spring Boot 3.x    |
| AI           | Spring AI          |
| Vector Store | In-Memory          |
| LLM          | OpenAI (pluggable) |
| Build        | Gradle             |


# Swagger UI
* http://localhost:8080/swagger-ui.html
# OpenAPI JSON
* http://localhost:8080/v3/api-docs