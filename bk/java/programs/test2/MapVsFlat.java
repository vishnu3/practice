package programs.test2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapVsFlat {
    public static void main(String[] args) {

        Customer cus = new Customer(101,"john","vishnu", Arrays.asList("303030303","40404040"));


        //Optional<Object> emptyOptional = Optional.empty();
        //System.out.println(emptyOptional);

        //Optional<String> emailOptional = Optional.of(cus.getEmail());
        //System.out.println(emailOptional);

        Optional<String> email = Optional.ofNullable(cus.getEmail());
        System.out.println(email.orElse("null value"));



    }
}
