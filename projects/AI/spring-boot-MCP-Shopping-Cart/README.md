# ToRead
* Shopping Cart MCP Server using Spring Boot, integrated with Claude Desktop.
  * We will expose these tools:<br>
     ➤ addToCart (Add product to cart)
     ➤ removeCart (Remove product from cart)
     ➤ getCart (Get product from cart)
     ➤ getCartTotal (Get total price from cart)

# Run MongoDB container:
* <img width="474" height="507" alt="image" src="https://github.com/user-attachments/assets/580a90e9-7876-4c16-a1f6-303507d92bd1" />
* docker run -d \
--name mongodb \
-p 27017:27017 \
-e MONGO_INITDB_ROOT_USERNAME=root \
-e MONGO_INITDB_ROOT_PASSWORD=secret \
mongo:latest
