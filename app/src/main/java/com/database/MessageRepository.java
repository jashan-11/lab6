package com.database;

import androidx.lifecycle.LiveData;
import java.util.List;

public class MessageRepository {
    private MessageDao messageDao;
    private LiveData<List<Message>> allMessages;

    public MessageRepository(MessageDao messageDao) {
        this.messageDao = messageDao;
        // Modify the line below to convert List<Message> to LiveData<List<Message>>
        this.allMessages = messageDao.getAllMessagesAsLiveData();
    }

    public LiveData<List<Message>> getAllMessages() {
        return allMessages;
    }

    public void insert(Message message) {
        // Perform insert operation in a background thread
    }

    public void delete(Message message) {
        // Perform delete operation in a background thread
    }
}
