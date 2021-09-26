package hkr;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'maxSubarrayValue' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long maxSubarrayValue(List<Integer> arr) {
        // Write your code here
        long result = 0;
        if (arr.isEmpty()) {
            return result;
        }
        int capacity = arr.size() / 2 + 1;
        List<Integer> even = new ArrayList<>(capacity);
        List<Integer> odd = new ArrayList<>(capacity);
        List<Long> resultList = new ArrayList<>(capacity);

        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                even.add(arr.get(i));
            } else if (i % 2 == 1) {
                odd.add(arr.get(i));
            }
        }

        long evenSum = even.stream().mapToLong(i -> i).sum();
        long oddSum = odd.stream().mapToLong(i -> i).sum();

        result = evenSum - oddSum;

        resultList.add(result * result);


        return 0;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.maxSubarrayValue(arr);
        System.out.println("result " + result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


