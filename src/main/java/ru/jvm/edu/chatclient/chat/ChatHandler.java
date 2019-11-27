package ru.jvm.edu.chatclient.chat;

public interface ChatHandler {

    void onNewMessage();

    void onUserListChanged();
}
