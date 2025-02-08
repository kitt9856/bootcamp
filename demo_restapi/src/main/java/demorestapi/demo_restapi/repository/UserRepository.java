package demorestapi.demo_restapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demorestapi.demo_restapi.entity.UserEntity;

//Hibernate, JPA
//! spring generate class for implementing the UserRepository
@Repository //Bean
public interface  UserRepository extends JpaRepository<UserEntity, Long> {
  //Generation Process: based on Database products(MySQL,PostgreSQL)
  //i.e. Oracle VARCHAR2, where MySQL VARCHAR

  //(from )
  //saveAll
  //findAll
  //findById
  //save

  //! so, Hibernate based on the DB product to generate all methods in JpaRepository
}

//jdbc support SQL, jpa 底層是jdbc , so jpa -> XXSQL
//php must write "SELECT..." in php file if DB is MySQL
//.. if Oracle same PHP must rewrite
