package com.tp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here


        Function<Integer, Integer> isAddReq = ele -> {
            int mod = ele % 5;
            if (ele < 38) {
                return ele;
            }
            if (mod >= 3) {
                ele += (5 - mod);
            }
            return ele;
        };

        return grades.stream().map(elm -> isAddReq.apply(elm)).collect(Collectors.toList());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Test.gradingStudents(arr).stream().forEach(System.out::println);


        bufferedReader.close();

    }

}
