package com.database;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MessageViewModel extends ViewModel {
    private MessageRepository repository;
    private LiveData<List<Message>> allMessages;

    public MessageViewModel(MessageRepository repository) {
        this.repository = repository;
        this.allMessages = repository.getAllMessages();
    }

    public LiveData<List<Message>> getAllMessages() {
        return allMessages;
    }

    public void insert(Message message) {
        repository.insert(message);
    }

    public void delete(Message message) {
        repository.delete(message);
    }
}
