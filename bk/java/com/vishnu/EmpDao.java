package com.vishnu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDao {

    public static List<Employee> getEmpList(){
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("vishnu",1,500));
        empList.add(new Employee("manoj",2,1500));
        empList.add(new Employee("ashish",3,2000));
        empList.add(new Employee("nishant",4,100));
        empList.add(new Employee("vishnu",1,500));
        empList.add(new Employee("nishant",4,100));

        return empList;
    }

    public static List<Integer> getIntList(){
        return Arrays.asList(1,2,1,3,3,3,5,6);
    }

    public static List<String> getStrList(){
        return Arrays.asList("vishnu","manoj","vishnu","manoj","manoj");
    }

    public static int[] getIntArr(){
        int[] temp = {1,2,3,1,3,5};
       return temp;
    }
}
