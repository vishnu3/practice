package hkr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void missingNumberArray(int[] arr, int count){
        int sum = count *(count+1)/2;
        int inputSum = Arrays.stream(arr).sum();

        System.out.println("Missing number is "+(sum-inputSum));

    }
    public static void main(String[] args) {
      missingNumberArray(new int[]{1,2,3,5},5);

    }
}
