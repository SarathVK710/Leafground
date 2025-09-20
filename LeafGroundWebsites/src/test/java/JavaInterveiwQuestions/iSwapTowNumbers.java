package JavaInterveiwQuestions;
//How to Swap two numbers without using third variable in java
public class iSwapTowNumbers {

    public static void main(String[] string){

        int a = 100;
        int b = 200;

        a = a + b;//300
        b = a - b;//300-200=100
        a = a - b;//300-100=200

        System.out.println(a);
        System.out.println(b);

    }
}
