package jpmc;

public class Pong implements Runnable {

    public Object object;

    public Pong(Object object) {
        this.object = object;
    }

    public void run() {
        synchronized (object) {
            for (int i = 0; i < 1000; i++) {
                System.out.println("pong");
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
