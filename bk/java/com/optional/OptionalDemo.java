package com.optional;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

       // Customer customer = new Customer(101,"vishnu","jeth@gmil", Arrays.asList("123","456"));

        Customer customer = new Customer(101,"vishnu",null, Arrays.asList("123","456"));

        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);



    }

}
