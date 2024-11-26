package org.example.mediator_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatApplication extends Application {
    private ChatMediator mediator = new ChatMediatorImpl();

    @Override
    public void start(Stage stage) throws Exception {
        createClientWindow("User1");
        createClientWindow("User2");
        createClientWindow("User3");
    }

    private void createClientWindow(String username) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("chat-view.fxml"));
        Scene scene = new Scene(loader.load());
        ChatController controller = loader.getController();
        ChatClient client = new ChatClient(username, mediator, controller);
        controller.setClient(client);

        Stage stage = new Stage();
        stage.setTitle(username);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}