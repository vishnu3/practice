import programs.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();


        List<Employee> list =  empList.stream().filter(e->e.getAge()>20).collect(Collectors.toList());


        String s = "book";


    }
}
