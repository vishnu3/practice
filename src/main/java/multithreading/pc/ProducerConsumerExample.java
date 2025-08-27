package multithreading.pc;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {
    int capacity;
    Queue<Integer> queue = new LinkedList<>();

    public ProducerConsumerExample(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size()==capacity) {
            wait();
        }
        queue.add(value);
        System.out.println("Produced : "+value);
        notifyAll();
    }

    public synchronized int consumer() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }

        int value = queue.poll();
        System.out.println("Consumed "+value);
        notifyAll();
        return value;
    }

    public static void main(String[] args) {
        ProducerConsumerExample pc = new ProducerConsumerExample(5);

        Thread producerThread = new Thread(() -> {
            try{
                for (int i=0; i< 10; i++) {
                    pc.produce(i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() ->{
            try {
                for (int i = 0; i < 10; i++) {
                    pc.consumer();
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
