package com.example.chat.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.chat.model.Status;
import com.example.chat.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    List<User> findAllByStatus(Status status);
}
