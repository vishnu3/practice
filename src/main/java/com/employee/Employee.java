package com.employee;

public class Employee {
    private int id;
    private int salary;
    private String name;
    private int deptId;
    private String status = "Active";

    public Employee(int id, int salary, String name, int deptId, String status) {
        super();
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.deptId = deptId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                ", status='" + status + '\'' +
                '}';
    }
}
