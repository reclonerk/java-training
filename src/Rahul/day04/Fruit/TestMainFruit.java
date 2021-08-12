package Rahul.day04.Fruit;

import java.util.*;

public class TestMainFruit {

    public static Map<String, Fruit> table = new HashMap<>();
    public static Queue<String> waitingQueue = new LinkedList<>();

    public static void main(String[] args) {
        table.put("Mango", new Fruit("Mango", 5));
        table.put("Banana", new Fruit("Banana", 5));
        table.put("Grape", new Fruit("Grape", 5));
        table.put("Orange", new Fruit("Orange", 5));


        waitingQueue.add("Rahul");
        waitingQueue.add("Uday");
        waitingQueue.add("Ajay");
        waitingQueue.add("Adarsh");
        waitingQueue.add("Adarsh2");
        waitingQueue.add("Adarsh3");

        while (waitingQueue.size() > 0){
            String name = waitingQueue.peek();
            String type = "Banana"; // Ask the child
            if(table.get(type).capacity > 0){
                table.get(type).capacity--;
                System.out.println("Enjoy and get out from queue");
            } else {
                System.out.println("no such fruit in basket");
            }
            waitingQueue.remove();
        }


    }
}
