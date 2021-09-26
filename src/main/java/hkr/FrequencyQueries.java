package hkr;
//https://www.hackerrank.com/challenges/frequency-queries/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class FrequencyQueries {

    static List<Integer> freqQuery(List<List<Integer>> queries) {

        if (queries.isEmpty()) {
            return Collections.emptyList();
        }

        List<Integer> outPut = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (List<Integer> query : queries) {
            Integer operation = query.get(0);
            Integer value = query.get(1);

            switch (operation) {
                case 1:
                    if (hashMap.containsKey(value)) {
                        hashMap.put(value, hashMap.get(value) + 1);
                    } else {
                        hashMap.put(value, 1);
                    }
                    break;
                case 2:
                    if (hashMap.containsKey(value)) {
                        hashMap.put(value, hashMap.get(value) - 1);
                    }
                    break;
                case 3:
                    if (hashMap.containsValue(value)) {
                        outPut.add(1);
                    } else {
                        outPut.add(0);
                    }
                    break;
            }
        }

        return outPut;


    }


    public static void main(String[] args) throws IOException {
        System.out.println("Hi");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File("C:/VishnuJ/test-projects/testout.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        System.out.println("ans " + ans);

        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
