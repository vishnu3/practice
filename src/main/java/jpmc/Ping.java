package jpmc;

public class Ping implements Runnable {
    public Object object;

    public Ping(Object object) {
        this.object = object;
    }

    public void run() {

        synchronized (object) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("ping");
                object.notify();
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
