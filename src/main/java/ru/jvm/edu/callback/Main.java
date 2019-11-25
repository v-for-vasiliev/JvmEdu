package ru.jvm.edu.callback;

public class Main {

    public static void main(String[] args) {
        Bomb bomb = new Bomb();
        OnExplodeListener onExplodeListener = new OnExplodeListener() {
            @Override
            public void onExplode(String message) {
                System.out.println("BOMB EXPLODED: " + message);
            }
        };
        bomb.setExplodeListener(onExplodeListener);

        bomb.fire();
    }
}
