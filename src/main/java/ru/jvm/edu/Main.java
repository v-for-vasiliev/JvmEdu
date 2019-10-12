package ru.jvm.edu;

public class Main {

    public static void main(String[] args) {
        //OOPTests.launch();
        //BuilderTests.launch();
        RegexpTests.testRegExp(
            "My email javacoder@gmail.com with password    SECRET115. Here is my old PASSWORD: PASS111.",
            "(?<=password:?\\s{0,30})[a-zA-Z0-9]+");
    }
}
