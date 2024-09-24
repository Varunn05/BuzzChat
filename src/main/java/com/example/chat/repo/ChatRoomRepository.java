package com.example.chat.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.chat.model.ChatRoom;

@Repository
public interface ChatRoomRepository extends MongoRepository<ChatRoom, String>{
    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
