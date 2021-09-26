package com.employee;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpFITest {
    public static void main(String[] args) {
        List<Employee> empList =  EmpDao.getEmpList();

        /*predict to filter get only inactive emp*/

        Predicate<Employee> p = e->{
            if(e.getStatus().equals("InActive")){
               return true;
            }
            return false;
        };

        empList.stream().filter(i->p.test(i))
                .collect(Collectors.toList()).forEach(j->System.out.println(j.toString()));




    }
}
