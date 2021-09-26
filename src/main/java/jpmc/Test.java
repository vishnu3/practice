package jpmc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList(5, 7, 9, 10, 5, 4));

        List<Integer> list = arrayList.stream().distinct().collect(Collectors.toList());
        list.stream().forEach(System.out::print);

    }
}
