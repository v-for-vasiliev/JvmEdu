package ru.jvm.edu.chatclient;

import ru.jvm.edu.chatclient.auth.AuthHandler;
import ru.jvm.edu.chatclient.chat.ChatHandler;

public class MessageServiceImpl implements MessageService {

    private Network network;

    private AuthHandler authHandler;

    private ChatHandler chatHandler;

    public MessageServiceImpl(Network network) {
        this.network = network;
        this.network.setMessageService(this);
    }

    @Override
    public void processMessage(Message message) {
        // TODO:
        // if (message == AUTH_OK) {
        //      authHandler.onAuthOk();
        // }
        // if (message == AUTH_FAILED) {
        //      authHandler.onError(message.error);
        // }
        // if (message == CHAT_MESSAGE) {
        //      chatHandler.onNewMessage(message.message);
        // }
        // if (message == USERS_LIST_CHANGED) {
        //      chatHandler.updateUsersList(message.usersList);
        // }
    }

    @Override
    public void sendMessage(Message message) {

    }

    @Override
    public void setAuthHandler(AuthHandler authHandler) {
        this.authHandler = authHandler;
    }

    @Override
    public void setChatHandler(ChatHandler chatHandler) {
        this.chatHandler = chatHandler;
    }
}
