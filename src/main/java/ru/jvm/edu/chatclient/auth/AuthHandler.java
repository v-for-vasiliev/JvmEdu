package ru.jvm.edu.chatclient.auth;

public interface AuthHandler {

    void onAuthOk();

    void onError(String error);
}
