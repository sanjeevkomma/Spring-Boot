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

# Images
* <img width="1195" height="1025" alt="image" src="https://github.com/user-attachments/assets/004a8785-bee3-4852-b892-1030494b19f9" />
* <img width="627" height="378" alt="image" src="https://github.com/user-attachments/assets/d6cf7754-d00c-4dff-84b7-7be871c3f2f7" />

