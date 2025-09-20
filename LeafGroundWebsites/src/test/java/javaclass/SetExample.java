package javaclass;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] arg){

        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);


    }
}
