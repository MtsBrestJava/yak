package by.mts.brest.lawyer;

public class Stream {

    public static void main(String[] args) throws InterruptedException {


        Thread stream1 = new Thread(new Potok(1));
        Thread stream2 = new Thread(new Potok(2));

        System.out.println("poneslas`");

        System.out.println("Detonator activating")
        stream1.start();
        stream1.join();
        System.out.println("Bomb detect");
        stream2.start();
        stream2.join();
        System.out.println("Tadam");


    }
}

        class Potok implements Runnable {

            int detonator;

            public Potok(int detonator) {

                this.detonator = detonator;

            }

        @Override
        public void run() {
            for (int i = 100; i > 0; i--) {
                System.out.println("T #" + detonator + " i = " + i);

            }
        }

