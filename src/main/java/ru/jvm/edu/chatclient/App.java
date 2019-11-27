package ru.jvm.edu.chatclient;

import ru.jvm.edu.chatclient.auth.AuthGui;

public class App {

    public static void main(String[] args) {
        Network network = new Network();
        MessageService messageService = new MessageServiceImpl(network);
        AuthGui authGui = new AuthGui(messageService);
        authGui.showForm();
    }
}
