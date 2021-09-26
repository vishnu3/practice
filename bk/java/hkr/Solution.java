package hkr;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'candies' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static long candies(int n, List<Integer> arr) {
        // Write your code here
        int[] ratingArr = new int[n];
        int[] c = new int[n];

        for(int i=0;i<n;i++){
              ratingArr[i] = arr.get(i);
              c[i] = 1;
        }
        int j;
        for(int i=0; i<n-1;i++){
            j=i+1;
            if(j==n){
                j -= 1;
            }

            if(ratingArr[i]>ratingArr[j]){
                if(c[i]>c[j]){

                }else {
                    c[i] = c[i]+c[j];
                }
            }
            if(ratingArr[i]<ratingArr[j]){
                if(c[i]<c[j]){

                }else {
                    c[j] = c[j]+c[i];
                }
            }
        }

        return Arrays.stream(c).sum();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.candies(n, arr);

        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
