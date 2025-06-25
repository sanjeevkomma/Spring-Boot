# JDBC vs JPA — Key Differences
| Feature                 | **JDBC**                           | **JPA (e.g., Hibernate)**                     |
| ----------------------- | ---------------------------------- | --------------------------------------------- |
| **Level**               | Low-level                          | High-level ORM                                |
| **SQL**                 | You write full SQL manually        | Minimal or no SQL (uses JPQL/annotations)     |
| **Boilerplate Code**    | Lots (manage connections, mapping) | Minimal (ORM handles it)                      |
| **Learning Curve**      | Easy if you know SQL               | Steeper – requires understanding JPA concepts |
| **Performance Control** | More direct                        | Less direct, but tunable                      |
| **Transactions**        | Manual/explicit                    | Handled by framework                          |
| **Use Case**            | Simple, custom queries             | Complex domain models, rapid development      |

# Final Thought
| Use Case                         | Recommendation                                |
| -------------------------------- | --------------------------------------------- |
| Full control, SQL-heavy apps     | Use **JDBC**                                  |
| Fast development, object mapping | Use **JPA**                                   |
| Want both flexibility and ease   | Combine **JPA + JDBC** (Spring supports both) |

# Templates in Spring framework for Database Access
| **Template**                 | **Purpose / Use Case**                                        | **Supports Named Parameters?** | **Recommended?**            | **Typical Usage**                        |
| ---------------------------- | ------------------------------------------------------------- | ------------------------------ | --------------------------- | ---------------------------------------- |
| `JdbcTemplate`               | Simplifies raw **SQL with JDBC**                              | ❌ No                           | ✅ Yes (widely used)         | Simple SQL queries, inserts, updates     |
| `NamedParameterJdbcTemplate` | SQL queries using **named parameters** for better readability | ✅ Yes                          | ✅ Yes                       | Dynamic queries, maps, named SQL values  |
| `SimpleJdbcInsert`           | Simplified inserts without writing SQL                        | ❌ No (but easier setup)        | ✅ For basic insert ops      | Auto-infers table/columns from metadata  |
| `SimpleJdbcCall`             | Calling stored procedures/functions                           | ❌ No                           | ✅ For legacy SP use         | Used in enterprise DBs with stored procs |
| `HibernateTemplate`          | Hibernate ORM integration (pre-Spring Data JPA)               | ❌ No                           | ⚠️ Legacy (not recommended) | Older Hibernate-based codebases          |
| `JpaTemplate`                | JPA integration (Spring 2.x, **deprecated**)                  | ❌ No                           | ❌ Deprecated                | Replaced by Spring Data JPA              |


# Datasources in Spring framework for Database Access
| **Type**                           | **Class / Library**                         | **Usage**                               |
| ---------------------------------- | ------------------------------------------- | --------------------------------------- |
| **Basic JDBC**                     | `DriverManagerDataSource` (Spring)          | Simple, no connection pooling           |
| **Apache Commons DBCP**            | `BasicDataSource`                           | Adds connection pooling                 |
| **HikariCP** (Spring Boot default) | `HikariDataSource`                          | Fast and preferred pool in modern apps  |
| **C3P0**                           | `ComboPooledDataSource`                     | Older pool implementation               |
| **Tomcat JDBC Pool**               | `org.apache.tomcat.jdbc.pool.DataSource`    | Often used in embedded Tomcat apps      |
| **JNDI**                           | Lookup via JNDI in `applicationContext.xml` | For enterprise containers like WebLogic |

