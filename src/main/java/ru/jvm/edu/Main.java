package ru.jvm.edu;

public class Main {

    private static int[] arr = new int[3];

    public static void main(String[] args) {
        //OOPTests.launch();
        //BuilderTests.launch();
        /*
        RegexpTests.testRegExp(
            "My email javacoder@gmail.com with password    SECRET115. Here is my old PASSWORD: PASS111.",
            "(?<=password:?\\s{0,30})[a-zA-Z0-9]+");*/
        //new MessengerMainForm().showForm();
        Bomb b = new Bomb();
        b.setExplodeListener(message -> System.out.println(message));
        b.fire();
        System.out.println("HAHAH");
    }

    private static class Bomb {

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
                explodeListener.onExplode("VAM PIZDEC");
            }
        }

        public void setExplodeListener(OnExplodeListener listener) {
            this.explodeListener = listener;
        }
    }

    interface OnExplodeListener {

        void onExplode(String message);
    }

    public static class ExplListener implements OnExplodeListener {

        @Override
        public void onExplode(String message) {
            System.out.println(message);
        }
    }
}
