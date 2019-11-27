package ru.jvm.edu.chatclient.auth;

import ru.jvm.edu.chatclient.Message;
import ru.jvm.edu.chatclient.MessageService;

public class AuthGui implements AuthHandler {

    private MessageService messageService;

    public AuthGui(MessageService messageService) {
        this.messageService = messageService;
        this.messageService.setAuthHandler(this);
    }

    @Override
    public void onAuthOk() {
        // TODO: show chat

    }

    @Override
    public void onError(String error) {
        // TODO: show error window
    }

    public void showForm() {

    }

    private void login() {
        String login = ""; // loginTextView.getText;
        String password = ""; // passwordTextView.getText;
        messageService.sendMessage(new Message("login + pass"));
    }
}
