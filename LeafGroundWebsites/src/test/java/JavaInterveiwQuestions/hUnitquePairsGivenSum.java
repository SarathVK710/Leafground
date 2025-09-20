package JavaInterveiwQuestions;

import java.util.ArrayList;
import java.util.HashMap;

//Given an array of integers, Count the number of valid pair with the given sum Ex:10 (Unique Pair)
public class hUnitquePairsGivenSum {

    public static void main(String[] string){

        int [] a = {1,2,3,4,5,7,8,9,6,10}; //(2,8)
        int target = 10;

        for (int i=0; i<a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                        System.out.println("{"+a[i]+","+a[j]+"}");
                }
            }
        }
    }

}
