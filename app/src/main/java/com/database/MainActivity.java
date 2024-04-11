package com.database;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ListView;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MessageViewModel viewModel;
    private EditText editTextMessage;
    private Button buttonAdd;
    private ListView listViewMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMessage = findViewById(R.id.editTextMessage);
        buttonAdd = findViewById(R.id.buttonAdd);
        listViewMessages = findViewById(R.id.listViewMessages);

        viewModel = new ViewModelProvider(this).get(MessageViewModel.class);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messageContent = editTextMessage.getText().toString().trim();
                if (!messageContent.isEmpty()) {
                    Message message = new Message(messageContent);
                    viewModel.insert(message);
                }
            }
        });

        // Initialize ListView adapter and set it to listViewMessages
        // Also handle deletion action
    }
}