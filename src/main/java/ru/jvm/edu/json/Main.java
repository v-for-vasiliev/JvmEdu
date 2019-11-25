package ru.jvm.edu.json;

import com.google.gson.Gson;

public class Main {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        fromJsonToObject();
        fromObjectToJson();
    }

    public static void fromJsonToObject() {
        String authMessageJson = "{ \"login\" : \"puhan\", \"password\": \"12345\" }";
        AuthMessage authMessageObject = gson.fromJson(authMessageJson, AuthMessage.class);
        System.out.println("AuthMessage object: login=" + authMessageObject.login + ", password="
            + authMessageObject.password);
    }

    public static void fromObjectToJson() {
        AuthMessage authMessageObject = new AuthMessage("Zaika", "54321");
        String authMessageJson = gson.toJson(authMessageObject);
        System.out.println("AuthMessage json: " + authMessageJson);
    }
}
