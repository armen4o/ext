package learning;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example2 {
    public void exampleArrayList(){

        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(123);
        arrayList.add(546);
        arrayList.add(8);
        arrayList.add(25);
        arrayList.add(96);
        arrayList.add(1);

//        some.clear();
//        some.remove(1);
        System.out.println("ArrayList:");

        for(Integer i : arrayList){
            System.out.println(i);
        }


    }

    public void exampleLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Armen");
        linkedList.add("Anna");
        linkedList.add("Luba");
        linkedList.add("Sofia");
        linkedList.add("Galina");
        linkedList.add("Mamikon");

        linkedList.add(1, "Raya");

        linkedList.remove(1);

        System.out.println("\nLinkedList:");

        for(String s : linkedList){
            System.out.println(s);
        }
    }
}
