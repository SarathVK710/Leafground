package javaclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {

    public static void main(String[] args) {
        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList: " + arrayList); // Output: ArrayList: [A, B, C]
        System.out.println("Element at index 1: " + arrayList.get(1)); // Output: Element at index 1: B
        arrayList.remove(1);
        System.out.println("ArrayList after removing element at index 1: " + arrayList); // Output: [A,C]
        arrayList.add(1, "D");
        System.out.println("ArrayList after adding element at index 1: " + arrayList); // Output: [A,C,D]

//         LinkedList example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("P");
        linkedList.add("Q");
        linkedList.add("R");
        System.out.println("LinkedList: " + linkedList); // Output: LinkedList: [P, Q, R]
        System.out.println("Element at index 1: " + linkedList.get(1)); // Output: Element at index 1: Q
        linkedList.remove(1);
        System.out.println("LinkedList after removing element at index 1: " + linkedList);
        linkedList.add(1, "S");
        System.out.println("LinkedList after adding element at index 1: " + linkedList);
    }
}
