package org.design.pattern.Factory;

public class Main {
    public static void main(String[] args){
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        employee.salary();
        Employee employee1 = EmployeeFactory.getEmployee("Web Developer");
        employee1.salary();
    }
}
