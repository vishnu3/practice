package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyNum {
    double num();
}

public class futureTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService s = Executors.newWorkStealingPool();

        MyNum num = () -> (int) Math.random();

        List<Callable<MyNum>> callables = Arrays.asList(
                () -> num,
                () -> num,
                () -> num,
                () -> num
        );

        s.invokeAll(callables)
                .stream()
                .map(myNumFuture -> {
                    try {
                        return myNumFuture.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return 0;
                }).collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
