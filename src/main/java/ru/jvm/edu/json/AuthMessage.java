package ru.jvm.edu.json;

import com.google.gson.annotations.SerializedName;

public class AuthMessage {

    @SerializedName("login")
    public String login;

    @SerializedName("password")
    public String password;

    public AuthMessage(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
