package com.jordanbigelow.spring_mysql;

import org.springframework.data.repository.CrudRepository;

import com.jordanbigelow.spring_mysql.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}
