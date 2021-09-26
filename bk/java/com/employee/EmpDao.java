package com.employee;

import java.util.Arrays;
import java.util.List;

public class EmpDao {

    public static List<Employee> getEmpList(){
     return Arrays.asList(
             new Employee(1,100,"Vishnu",10,"Active"),
             new Employee(2,200,"manoj",10,"Active"),
             new Employee(3,500,"Ashish",20,"Active"),
             new Employee(4,800,"Loaha",30,"InActive"),
             new Employee(5,1000,"Ranjani",40,"Active"),
             new Employee(6,50,"Ram",20,"InActive"),
             new Employee(7,10,"Sita",10,"InActive")
     );
    }
}
