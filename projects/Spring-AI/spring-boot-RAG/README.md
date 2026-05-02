# RAG Flow
```mathematica
Text Docs → Embeddings → Vector Store
User Question → Similarity Search → Context
Context + Question → LLM → Answer
```

# Definition
* RAG = Retrieval-Augmented Generation
* Retrieve relevant data → give it to AI → AI generates answer
* RAG = RAG is a technique where relevant data is retrieved from external sources and provided to an AI model to generate more accurate, up-to-date, and context-aware responses.
* Search first, then answer = RAG

# ToRead
* embedding = vector
* Vector DB = It stores data as embeddings (vectors) so we can search by meaning, not just exact text.

# Vector DB = search by meaning, not words
* Semantic search = searching by meaning, not just exact words
* Context-aware
* Works even with different wording

# Analogy
* SQL = search by word 🔤
* Vector DB = search by meaning 🧠

# What is an embedding?
* Text → converted into numbers (vector)
* Similar meaning → similar numbers
* | Text      | Meaning |
  | --------- | ------- |
  | “car”     | 🚗      |
  | “vehicle” | 🚗      |
* Even if words differ, vectors are close

# How Semantic search works?
1. Convert text → embeddings (vectors)
2. Store in vector DB
3. Convert query → vector
4. Find similar vectors


# Tech Stack
| Layer        | Choice             |
| ------------ |--------------------|
| Java         | 21                 |
| Framework    | Spring Boot 3.x    |
| AI           | Spring AI          |
| Vector Store | In-Memory          |
| LLM          | OpenAI (pluggable) |
| Build        | Gradle             |


# Questions
1. who will store the data into vector db ? 
* You (your system) store the data in the vector DB — not the LLM
* You load the data, not the AI
* The data is stored in the vector database by the developer’s application during the ingestion process, where documents are converted into embeddings and saved; the LLM itself does not store or manage this data.
2. What exactly does the LLM (AI model) do in RAG?
* In RAG, the LLM reads the retrieved data and generates the final answer in natural language.

# Swagger UI
* http://localhost:8080/swagger-ui.html
# OpenAPI JSON
* http://localhost:8080/v3/api-docs