package javaclass;

import java.util.ArrayList;
import java.util.List;

public class TryExamples {
    public static void main(String[] str){

        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.remove(1);
        arrayList.add("D");
        arrayList.add(1,"B");


        System.out.println(arrayList);
    }
}
