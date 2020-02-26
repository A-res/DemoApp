package com.ares.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    //List<User> findByLastName(String lastname)
}
