package com.example.chat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chat.model.Status;
import com.example.chat.model.User;
import com.example.chat.repo.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository repository;

    public void saveUser(User user) {
        user.setStatus(Status.ONLINE);
        repository.save(user);
    }

    public void disconnectUser(User user) {
        var storeUser = repository.findById(user.getNickname())
            .orElse(null);

        if (storeUser != null) {
            storeUser.setStatus(Status.OFFLINE);
            repository.save(storeUser);
        }    
    }

    public List<User> findConnectedUsers() {
        return repository.findAllByStatus(Status.ONLINE);
    }
}
