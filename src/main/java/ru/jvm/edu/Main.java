package ru.jvm.edu;

public class Main {

    public static void main(String[] args) {
        //OOPTests.launch();
        //BuilderTests.launch();
        RegexpTests.testRegExp("If X is 609348676234, Y is 3077, the sum is 609348679311.", "[0-9]{10,}");
    }
}
