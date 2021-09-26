package jpmc;

public class PingPongGame {
    public static void main(String[] args) {
        Object object = new Object();
        Ping ping = new Ping(object);
        Pong pong = new Pong(object);


        Thread pingThread = new Thread(ping);
        Thread pongThread = new Thread(pong);


        pingThread.start();
        pongThread.start();

    }

}
