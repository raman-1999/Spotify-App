package com.example.challenge.repository;

import com.example.challenge.domain.UserDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDomain,String> {

}
