package com.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "messages")
public class Message {
    @PrimaryKey(autoGenerate = true)
    public long id;

    public String content;

    public Message(String content) {
        this.content = content;
    }
}