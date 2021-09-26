package programs;

public class Fibonacci {
    public static void main(String[] args) {
        FibonacciCal(50);
        //formula fn = fn-1+fn-2;
    }

    public static void FibonacciCal(int n) {
        int i = 1, j = 1;
        int k = 1;

        System.out.print(i + " " + j);

        for (int l = 3; l < n; l++) {
            k = i + j;
            System.out.print(" " + k);
            j = i;
            i = k;
        }


    }
}
