package ru.jvm.edu.chatclient;

import ru.jvm.edu.chatclient.auth.AuthHandler;
import ru.jvm.edu.chatclient.chat.ChatHandler;

public interface MessageService {

    void processMessage(Message message);

    void sendMessage(Message message);

    void setAuthHandler(AuthHandler authHandler);

    void setChatHandler(ChatHandler chatHandler);
}