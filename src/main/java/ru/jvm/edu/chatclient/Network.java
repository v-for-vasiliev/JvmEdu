package ru.jvm.edu.chatclient;

public class Network {

    private MessageService messageService;

    public Network() {

    }

    private void readMessages() {
        while (true) {
            String rawMessage = ""; // in.readUtf();
            if (messageService != null) {
                messageService.processMessage(new Message(rawMessage));
            }
        }
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
}
