package org.design.pattern.Singleton;

public class Main {
    public static void main(String [] args){
        Singleton s1 = Singleton.getThisIsObject();
        System.out.println(s1.hashCode());
        Singleton s2 = Singleton.getThisIsObject();
        System.out.println(s2.hashCode());

        Singleton s3 = Singleton.getEagerWay();
        System.out.println(s3.hashCode());
        Singleton s4 = Singleton.getEagerWay();
        System.out.println(s4.hashCode());
    }
}
