package com.tp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tpAlgo {

    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        ArrayList<Integer> indexEle = new ArrayList<>();

        for (int x = 1; x <= p.size(); x++) {
            indexEle.add(p.indexOf(p.indexOf(x) + 1) + 1);

            int p1 = p.indexOf(x);
            int p2 = p.indexOf(p1 + 1) + 1;
            indexEle.add(p2);


        }


        return indexEle;
    }


    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
*/
        List<Integer> result = permutationEquation(Arrays.asList(2, 3, 1));

        result.forEach(System.out::println);

        /*bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );*/


    }
}
