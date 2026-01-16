CREATE TABLE users (
  user_id STRING(36) NOT NULL,
  name STRING(100),
  email STRING(100),
  created_at TIMESTAMP OPTIONS (allow_commit_timestamp=true)
) PRIMARY KEY (user_id);
