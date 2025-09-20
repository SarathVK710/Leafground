package JavaInterveiwQuestions;
import java.util.HashMap;
import java.util.Map;

public class KOccurrenceOfEachCharacter {
//How would you write a Java program to find the occurrence of each character in a string?
    public static void main(String[] string) {
        String name = "sarath kumar vk"; //(e.g., "Try programming" T:1, r:3)
        String myName = name.replace(" ","");
        Map<Character,Integer> value = new HashMap<>();
        char [] chart = myName.toCharArray();
        for (char output:chart){
            if (!value.containsKey(output)){
                value.put(output,1);
            }else {
                int values = value.get(output);
                value.put(output,values+1);
            }
        }
        System.out.println(value);
    }
}