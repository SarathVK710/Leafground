package JavaInterveiwQuestions;
//How to remove the elements from an array in Java
import java.util.Arrays;

public class fRemoveValueFromArray {
    public static void main(String[] args){
        int[] a = {11,12,13,14,14,15}; // remove 14
        int count14 = 0;

        for(int output:a){
            if (output == 14){
                count14++;
            }
        }
        int [] newArray = new int [a.length - count14];
        int index = 0;
        for (int value:a){
            if (value != 14){
                newArray[index++] = value;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}