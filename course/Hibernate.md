# To Read
1. N + 1 problem in Hibernate = Hibernate N + 1 problem occurs when you use FetchType. LAZY for your entity associations
2. If you perform a query to select n-entities and if you try to call any access method of your entity's lazy association, Hibernate will perform n-additional queries to load lazily fetched objects

* Hibernate provides ways to eliminate N + 1 problem
1. use join fetch
2. use @BatchSize on the lazy association
3. use a sub query returning a list of author identifiers


# Reference
* [3 Ways to Deal With Hibernate N+1 Problem](https://hackernoon.com/3-ways-to-deal-with-hibernate-n1-problem)

