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
