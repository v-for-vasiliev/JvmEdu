package ru.jvm.edu.json;

import com.google.gson.Gson;

public class Main {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        String authMessageJson = "{ \"login\" : \"puhan\", \"password\": \"12345\" }";
        AuthMessage authMessageObject = gson.fromJson(authMessageJson, AuthMessage.class);
        System.out.println("AuthMessage object: login=" + authMessageObject.login + ", password="
            + authMessageObject.password);
    }
}
