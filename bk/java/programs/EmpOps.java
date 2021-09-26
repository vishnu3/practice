package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpOps {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("a",25,1,"mum"),
                new Employee("b",20,2,"mum"),
                new Employee("c",30,3,"mum"),
                new Employee("d",40,4,"mum"),
                new Employee("e",28,6,"mum"),
                new Employee("f",45,1,"mum")
        );

        operation(empList);

    }

    public static void operation(List<Employee> employees){
        // find list of employee having age >25
        employees =
                employees.stream()
                .filter(employee -> employee.getAge()>25)//.map(System.out::println);
                .collect(Collectors.toList());

        employees.forEach(System.out::println);



    }
}
