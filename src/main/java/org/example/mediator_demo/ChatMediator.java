package org.example.mediator_demo;

import javafx.event.ActionEvent;

public interface ChatMediator {
    void registerClient(ChatClient client);
    void sendMessage(String message, String sender, String recipient);

    void onSendButtonClick(ActionEvent actionEvent);
}