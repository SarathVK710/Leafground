package JavaInterveiwQuestions;

public class bReverseStringQuestion {

    public static void main(String[] args){

//2.How to Reverse a String? sarath => htaras
        String name = "Sarath kumar VK";
        String sum = "";
        for(int i=name.length()-1; i>=0;i--){
            char reverse = name.charAt(i);
            sum += reverse;
        }
        System.out.println(sum);
    }
}