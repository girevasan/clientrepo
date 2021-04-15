package com.client.demo;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Id>{

}
