package com.employee;

import java.util.*;
import java.util.stream.Collectors;

public class tpPro {
    public static void main(String[] args) {

        /*find duplicate elements in a given integers list in java using Stream functions*/

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        List<Integer> templist = Arrays.asList(100,150,80,490,250,980,980,320,150);

        List<List<Integer>> listOfLis = new ArrayList<>();
        listOfLis.add(myList);listOfLis.add(templist);


        Set<Integer> set = new HashSet<>();

        myList.stream().filter(n->!set.add(n)).forEach(System.out::println);

        /*first element of the list using Stream functions*/

         myList.stream().findFirst().ifPresent(System.out::println);

         /* find the maximum and mininum value element present in it using Stream functions*/

        myList.stream().max(Integer::compare).ifPresent(System.out::println);

        myList.stream().min(Integer::compare).ifPresent(System.out::println);

        /* create single list from listOflis*/

       List<Integer> flatList =  listOfLis.stream().flatMap(i -> i.stream()).collect(Collectors.toList());

       flatList.forEach(i->System.out.print(i+" "));

       /* find the sum of all elements */

        int totalSum = listOfLis.stream()
                .flatMap(i->i.stream())
                .reduce(0,(a,b)->a+b,Integer::sum).intValue();
        System.out.println("Total sum "+totalSum);



        /*Multiply itself**/
        listOfLis.stream()
                .flatMap(i->i.stream()).reduce((a,b)->a+b).ifPresent(System.out::println);


    }
}
