package org.design.pattern.Singleton;

public class Singleton {

    private Singleton(){
    }

    private static Singleton thisIsObject;

//    Lazy way of creating object
    public static Singleton getThisIsObject() {

        if(thisIsObject == null){
            thisIsObject = new Singleton();
        }

        return thisIsObject;
    }
//    Eager way of creating object
    private static Singleton eagerWay = new Singleton();

    public static Singleton getEagerWay(){
        return eagerWay;
    }

//    creating thread safe object
    private static Singleton threadSafeObject = new Singleton();

    public static Singleton getThreadSafeObject(){
        if(threadSafeObject == null){
            synchronized (Singleton.class){
                if(threadSafeObject == null){
                    threadSafeObject = new Singleton();
                }
            }
        }

        return threadSafeObject;
    }
}
