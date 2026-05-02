# ToRead
* Shopping Cart MCP Server using Spring Boot, integrated with Claude Desktop.
  * We will expose these tools:<br>
     ➤ addToCart (Add product to cart)<br>
     ➤ removeCart (Remove product from cart)<br>
     ➤ getCart (Get product from cart)<br>
     ➤ getCartTotal (Get total price from cart)

# Flow
* <img width="844" height="324" alt="image" src="https://github.com/user-attachments/assets/1c57fcda-11fe-4f04-8368-e30806102920" />

    

# Run MongoDB container:
* <img width="474" height="507" alt="image" src="https://github.com/user-attachments/assets/580a90e9-7876-4c16-a1f6-303507d92bd1" />
* docker run -d \
--name mongodb \
-p 27017:27017 \
-e MONGO_INITDB_ROOT_USERNAME=root \
-e MONGO_INITDB_ROOT_PASSWORD=secret \
mongo:latest

# REST API vs MCP
| Feature          | REST API   | MCP Tool      |
| ---------------- | ---------- | ------------- |
| Entry point      | Controller | Tool method   |
| Input format     | JSON       | Method params |
| Discovery        | Manual     | Automatic     |
| AI understanding | ❌ Hard     | ✅ Easy        |
| Coupling         | Tight      | Loose         |
