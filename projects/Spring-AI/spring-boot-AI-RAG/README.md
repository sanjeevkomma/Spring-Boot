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


# Test
* http://localhost:8080/rag/ask?q=What is RAG?