package com.vishnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class EmpMain {
    public static void main(String[] args) {
        List<Employee> empList = EmpDao.getEmpList();

        /*find duplicate object with count*/
        Map<Employee, Long> collect = empList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((k, v) -> {
            System.out.println(k.toString() + " " + v.longValue());
        });

        /**/


        Map<Integer, Long> intLis = EmpDao.getIntList().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        intLis.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        /**/
        String s = "Today is Hard, Tomorrow is Best";
        System.out.println("number of words " + s.split(" ").length);

        /**/

        /*sort emp based on salary*/

        List<Employee> emp = empList.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).collect(Collectors.toList());

        emp.forEach(System.out::println);

        /**get Int array duplicate **/

        int[] a = {1, 1, 2, 2, 4, 5, 7, 7, 8, 9};

        int[] b = new int[a.length];


        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(a).boxed().distinct().collect(Collectors.toList());

        list.stream().forEach(System.out::print);


    }
}
