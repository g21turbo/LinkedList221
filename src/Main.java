import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        LinkedList linkedList  = new LinkedList();

        linkedList.add("Bob");
        linkedList.add("John");
        linkedList.add("Jim");
        linkedList.add("Jack");
        linkedList.add("Pam");
        linkedList.add("Mary");




        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.get(4));

        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            if (it.next() == "Pam"){
                System.out.println("We found Pam");
            }
        }

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == "Bob"){
                System.out.println("We found Bob");
            }
        }

    }




}
