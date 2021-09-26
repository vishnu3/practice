package com.employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        List<Employee> empList =  EmpDao.getEmpList();

        /*print emp details based on dept*/

        Map<Integer, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId));

        collect.forEach((k,v)->{
            System.out.println(
                    k
            );
            v.forEach(j-> System.out.println(j.toString()));
            System.out.println();
        });

        /* Emp count working each dept*/

        Map<Integer, Long> two = empList.stream().
                collect(Collectors.groupingBy(Employee::getDeptId,
                Collectors.counting()));

        two.entrySet().forEach(
                System.out::println
        );

        /* find employee name by status*/

        Map<String, List<Employee>>  three = empList.stream().collect(Collectors.groupingBy(
                Employee::getStatus,
                Collectors.toList()
        ));

        three.entrySet().forEach( entry ->
                System.out.println(
                        entry.getKey()+"  "+
                                entry.getValue().stream().map(i->i.getName()).collect(Collectors.joining(","))
                )
        );

        /*find min /max salary**/

        List<Employee> temp = empList.stream().sorted(((o1, o2) -> (int)(o1.getSalary()-o2.getSalary()))).collect(Collectors.toList());

        System.out.println("Min ->"+temp.get(0).toString()+
                "  Max  ->"+temp.get(temp.size()-1).toString());

        Employee e1 = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Max - >"+e1.toString());

        Employee e2 = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Min - > "+e2.toString());

        /***Max salary from each dept***/

        Map<Integer, Optional<Employee>>  maxByDept = empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptId,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))
        ));

        maxByDept.entrySet().forEach(entry->{
            System.out.println("Max by Dept");
            System.out.println(
                    entry.getKey()+" "+entry.getValue().get()
            );
        });


        /**/
        Map<Employee, Long> duplicateCount = empList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(
                duplicateCount.toString()
        );



        /*convert list to Map*/
        System.out.println("");
        System.out.println("list to Map ");
        Map<Integer, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getId));

        empMap.entrySet().forEach(entry->
                System.out.println(entry.getKey()+" "+entry.getValue())
        );

    }
}
