This is a simple exercise that uses plain-vanilla JPA. It illustrates how JPA is used *without* the help of a Spring Framework.

The instructor can use this to highlight the amount of boilerplate (similar to JDBC) needed to use JPA (e.g. getting an `EntityManager` and closing it).

The demo uses Hibernate (as the persistence provider), HSQL (in-memory database), and a simple `Person` entity.

The logging is configured to display the SQL statements.
