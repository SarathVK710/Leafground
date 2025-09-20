package javaclass;

public class Polymorphism {

    public void m1(int a){
        System.out.println("int a");
    }
    public void m1(String a){
        System.out.println("String a");
    }
    public void m1(int a, int b){
        System.out.println("int a, int b");
    }
    public void m1(String a, int b){
        System.out.println("String a, int b");
    }

    public static void main(String[] str){
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.m1(1);
        PolymorphismOverriding polymorphismOverriding = new PolymorphismOverriding();
        polymorphismOverriding.m1(1);
    }

}




//Polymorphism allows methods with the same name.
//for example we create 3 methods
//m1() method
//m2() method
//m3() method
//So now backend create for 3 separate memory. To avoid this, polymorphism uses the same method name,
//differentiated by parameters or data types. but java requires method names to be unique.
//so polymorphism uses the same name but different parameters
//
//For Example
//m1() method provide for 1 parameter
//m1() method provide for 2 parameter
//
//Sometimes, even if we set another parameter [m1(provide for 1 parameter)], we can differentiate
//it using the data type.
//1st rule is "method name should be the same"
//2nd rule is "so like we should differentiate with the parameters and it is having same parameters
//we should differentiate datatype
//
//Method Overloading -> compile-time polymorphism
//When all the methods we create are present in the same class, method overloading occurs.
//So, overloading occurs when it takes place in the same class. And, the method name should be the same,
//either by the parameter or data type.

//Method Overriding -> Runtime polymorphism
//If it occurs in a different class, then that is method overriding.