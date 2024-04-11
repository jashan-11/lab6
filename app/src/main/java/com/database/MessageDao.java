package com.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;
import java.util.List;

@Dao
public interface MessageDao {
    @Query("SELECT * FROM messages")
    LiveData<List<Message>> getAllMessages();

    LiveData<List<Message>> getAllMessagesAsLiveData();

    // Add other DAO methods here for insert, delete, etc.
}