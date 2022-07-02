# JPA implementations
|S.No | #Pattern  | #Intent |
| :---: | :---: | :---: |
|1 | Hibernate |The most advanced and widely used. Pay attention for the classpath because a lot of libraries are used, especially when using JBoss. Supports JPA 2.1  |
|2 | Toplink |Only supports the basic JPA specs. (This was oracle’s free version of the JPA implementation)  |
|3 | EclipseLink |Is based on TopLink, and is the intended path forward for persistence for Oracle and TopLink. Supports JPA 2.1  |
|4 | Apache OpenJPA |Best documentation but seems very buggy. Open source implementation for JPA. Supports JPA 2.0  |
|5 | DataNucleus |Well documented, open source (Apache 2 license), is also a JDO provider. Supports JPA 2.1  |
|6 | ObjectDB | |
|7 | CMobileCom JPA |light-weight JPA 2.1 implementation for both Java and Android  |

# To Read
* Before JPA --- JDBC, Spring JDBC ( JDBCTemplate , it’s a layer on top of JDBC ) , myBatis Framework ( It maps Objects to Queries with Annotations ) ------ We write SQL queries
* JDBC(SQL Queries) --> Spring JDBC(JDBCTemplate) --> myBatis(Objects to Queries) --> JPA (Objects to Tables)--> Hibernate(Objects to Tables)
* JPA ( Interface ) --> Hibernate ( Implementation of JPA )
* Spring Data JPA ( JpaRepository)
* JPA ( Map classes to Tables ) --- JPQL, Criteria API
* JPA is an interface / specification
* Hibernate implements JPA
* JPA defines all the Annotations
* JPA is an interface and Hibernate is an implementation
* Hibernate = ORM framework
* JPA standardizes ORM
* Hibernate is the implementation of JPA
* By default, Spring Boot data JPA dependency uses Hibernate ( implementation of JPA ) internally
* Annotations ---- @Entity , @EntityManager, @Repository, @Transactional , @PersistenceContext
* Command Line Runner ( CommandLineRunner interface ) ---> Whenever application starts/launches, the code in the command line runner will be executed
* Spring Boot Auto Configuration will do Datasource config
* Hibernate is default implementation of JPA
* HibernateJPAAutoConfiguration, DataSourceAutoConfiguration

# Tutorial
* [JPA Hibernate Tuutorial](https://www.springboottutorial.com/jpa-hibernate-tutorial-for-beginners)
* [JPA Implemenation](https://stackoverflow.com/questions/17883971/which-provider-should-be-used-for-the-java-persistence-api-jpa-implemenation)
