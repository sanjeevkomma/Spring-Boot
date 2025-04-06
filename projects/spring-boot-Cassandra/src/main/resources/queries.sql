CREATE KEYSPACE IF NOT EXISTS demo_keyspace WITH replication = {
  'class': 'SimpleStrategy',
  'replication_factor': 1
};

CREATE TABLE IF NOT EXISTS demo_keyspace.users (
  id TEXT PRIMARY KEY,
  name TEXT,
  email TEXT
);
