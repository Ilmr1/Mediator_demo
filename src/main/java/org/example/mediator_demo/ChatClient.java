package org.example.mediator_demo;

public class ChatClient {
    private String username;
    private ChatMediator mediator;
    private ChatController controller;

    public ChatClient(String username, ChatMediator mediator, ChatController controller) {
        this.username = username;
        this.mediator = mediator;
        this.controller = controller;
        mediator.registerClient(this);
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String message, String recipient) {
        mediator.sendMessage(message, username, recipient);
    }

    public void receiveMessage(String message, String sender) {
        controller.displayMessage(sender + ": " + message);
    }
}