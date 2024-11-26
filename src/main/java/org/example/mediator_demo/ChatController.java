package org.example.mediator_demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextArea chatArea;
    @FXML
    private TextField messageField;
    @FXML
    private TextField recipientField;
    @FXML
    private Button sendButton;

    private ChatClient client;

    public void setClient(ChatClient client) {
        this.client = client;
    }

    @FXML
    protected void onSendButtonClick() {
        String message = messageField.getText();
        String recipient = recipientField.getText();
        client.sendMessage(message, recipient);
        messageField.clear();
    }

    public void displayMessage(String message) {
        chatArea.appendText(message + "\n");
    }
}