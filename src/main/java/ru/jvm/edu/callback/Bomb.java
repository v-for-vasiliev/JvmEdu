package ru.jvm.edu.callback;

class Bomb {

    private OnExplodeListener explodeListener;

    public void fire() {
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000);
                System.out.println("Tick: " + i);
            } catch (InterruptedException ignore) {
            }
        }
        if (explodeListener != null) {
            explodeListener.onExplode("Boom!");
        }
    }

    public void setExplodeListener(OnExplodeListener listener) {
        this.explodeListener = listener;
    }
}