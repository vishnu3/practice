package programs.test2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {


    public static List<Customer> getAll(){
        return Stream.of(
        new Customer(101,"john","abc@gmail", Arrays.asList("303030303","40404040")),
        new Customer(202,"manoj","lkg@gmail", Arrays.asList("303030303","40404040")),
        new Customer(303,"life","mlm@gmail", Arrays.asList("303030303","40404040")),
        new Customer(404,"mom","lsk@gmail", Arrays.asList("303030303","40404040"))
        ).collect(Collectors.toList());
    }


}
