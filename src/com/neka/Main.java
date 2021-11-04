package com.neka;

interface Demo{
    int i=9; //you can create var within interface
    void abc();
    //default void show{} --->you create default method in interface
    // and to decalre this method we create a seperate class and object to define it
    //now you can use "static" keyword

    static void show(){
        System.out.println("Now in Java 1.8, you can call method using static as obj is not required");
    }
}

class DemoImp implements Demo{
    @Override
    public void abc() {
        i = 10 ;// --->error : by default if you create a var in interafce it becomes const(final)
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Demo.show();
    }
}
