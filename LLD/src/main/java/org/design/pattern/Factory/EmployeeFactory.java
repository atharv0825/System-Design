package org.design.pattern.Factory;

public class EmployeeFactory {
    public static Employee getEmployee(String name){
        if(name.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(name.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        else{
            return null;
        }
    }
}
