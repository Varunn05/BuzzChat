package com.example.chat.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.chat.model.ChatMessage;
import java.util.List;


@Repository 
public interface ChatMessageRepository extends MongoRepository<ChatMessage, String>{
    List<ChatMessage> findByChatId(String s);
}
