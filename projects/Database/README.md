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

# Entity Managers in Spring for Database Access
| **Component**          | **Type**                | **What It Is**                                                                  | **When to Use**                            | **Managed By**                   |
| ---------------------- | ----------------------- | ------------------------------------------------------------------------------- | ------------------------------------------ | -------------------------------- |
| `EntityManager`        | JPA API                 | Interface for managing **JPA entities** and performing CRUD/JPQL/native queries | When using **Spring Data JPA** or JPA APIs | Spring via `@PersistenceContext` |
| `EntityManagerFactory` | JPA API                 | Factory for creating `EntityManager` instances                                  | In low-level config or custom setups       | Spring or manually               |
| `JpaRepository`        | Spring Data abstraction | Provides **auto-generated queries** & CRUD using `EntityManager` internally     | Most modern Spring JPA projects            | Spring Data                      |
| `@PersistenceContext`  | JPA annotation          | Injects a **container-managed EntityManager**                                   | Used in DAO or service layer               | Spring Container                 |
| `@Transactional`       | Spring annotation       | Wraps DB operations in a **transaction**; required for `EntityManager` to work  | Every method using EntityManager           | Spring AOP                       |


# Transaction Managers in Spring for Database Access
| **Transaction Manager**                                  | **Use Case**                                               | **Typical With**                     | **Supports @Transactional?** | **Notes**                                                         |
| -------------------------------------------------------- | ---------------------------------------------------------- | ------------------------------------ | ---------------------------- | ----------------------------------------------------------------- |
| `DataSourceTransactionManager`                           | For plain **JDBC**-based transactions                      | `JdbcTemplate`, raw JDBC             | ✅ Yes                        | Default for JDBC in Spring (non-JPA)                              |
| `JpaTransactionManager`                                  | For **JPA** (Java Persistence API) with ORM                | `EntityManager`, `JpaRepository`     | ✅ Yes                        | Commonly used with **Hibernate**, EclipseLink via Spring Data JPA |
| `HibernateTransactionManager`                            | For **Hibernate** (native) without JPA                     | `SessionFactory` + HibernateTemplate | ✅ Yes                        | Rare today; use `JpaTransactionManager` for new projects          |
| `JtaTransactionManager`                                  | For **distributed transactions** across multiple resources | Atomikos, Bitronix, or app servers   | ✅ Yes                        | Useful in microservices, XA transactions                          |
| `ChainedTransactionManager` *(from Spring Data Commons)* | For **combining multiple transaction managers**            | Multi-DB or DB + messaging systems   | ✅ Yes                        | Executes in order; rollback happens in reverse                    |

# Entity Manager vs Transaction Manager
| **Aspect**                | **EntityManager**                              | **TransactionManager**                                       |
| ------------------------- | ---------------------------------------------- | ------------------------------------------------------------ |
| **Belongs To**            | JPA (Java Persistence API)                     | Spring Framework (Spring TX module)                          |
| **Purpose**               | Handles **entity persistence operations**      | Handles **transaction boundaries**                           |
| **Controls**              | Entity lifecycle, queries, persistence context | Begin, commit, rollback of transactions                      |
| **Typical Class**         | `javax.persistence.EntityManager`              | `org.springframework.transaction.PlatformTransactionManager` |
| **Spring Integration**    | Injected via `@PersistenceContext`             | Auto-wired or configured via `@Bean`                         |
| **Usage Layer**           | DAO / Repository layer                         | Service layer (with `@Transactional`)                        |
| **Common Implementation** | Hibernate’s `Session`                          | `JpaTransactionManager`, `DataSourceTransactionManager`      |


# When to use which Entity Manager

# When to use which Transaction Manager
| Situation                                 | Use This                       |
| ----------------------------------------- | ------------------------------ |
| Simple app using `JdbcTemplate`           | `DataSourceTransactionManager` |
| App using Spring Data JPA / Hibernate     | `JpaTransactionManager`        |
| Hibernate without JPA                     | `HibernateTransactionManager`  |
| Distributed transactions (e.g., DB + JMS) | `JtaTransactionManager`        |
| Multiple data sources in one service      | `ChainedTransactionManager`    |
