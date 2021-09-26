package com.vishnu;

import java.util.HashMap;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("a", 10, 4001);
        Person p2 = new Person("b", 11, 4001);
        Person p3 = new Person("c", 14, 4001);
        Person p4 = new Person("d", 16, 4001);

        Person p10 = new Person("a", 10, 4001);

        HashMap<Person, Integer> hashMap = new HashMap<>();
        hashMap.put(p1, 1);
        hashMap.put(p2, 2);
        hashMap.put(p3, 3);
        hashMap.put(p4, 4);

        System.out.println(Optional.ofNullable(hashMap.get(p1)));


    }
}

class Person {
    private String name;
    private int age;
    private long pinCode;

    public Person(String name, int age, long pinCode) {
        this.name = name;
        this.age = age;
        this.pinCode = pinCode;
    }

    public Person() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pinCode=" + pinCode +
                '}';
    }
}