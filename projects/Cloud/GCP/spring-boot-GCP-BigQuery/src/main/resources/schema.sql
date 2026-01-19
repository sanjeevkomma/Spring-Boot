CREATE DATASET ecommerce;
--------------
CREATE TABLE ecommerce.orders (
  order_id STRING,
  customer_id STRING,
  amount FLOAT64,
  status STRING,
  created_at TIMESTAMP
);
--------------