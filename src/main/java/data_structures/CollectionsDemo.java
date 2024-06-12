package data_structures;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        // setDemo();
        // listDemo();
        // queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet(); // mutable set
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(fruits);

        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

        Set moreFruit = Set.of("pear", "raisin", "cherry"); // immutable set
        moreFruit.add("cranberry"); // runtime error: UnsupportedOperationException
        System.out.println(moreFruit);
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<>(); // mutable List
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");

        // Enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // forEach
        fruits.forEach(System.out::println);

        fruits.remove("lemon"); // remove the first instance
        fruits.remove(3);

        System.out.println("index 2: " + fruits.get(2));
        System.out.println("index of grape: " + fruits.indexOf("grape"));

        System.out.println(fruits);

        List moreFruit = List.of("cherry", "plum"); // immutable List
    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        var removed = fruits.remove(); // remove the first element
        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());
        System.out.println(fruits);
    }

    public static void mapDemo() {
        // Map is not a child of Collection, so it doesn't share the same methods as other Collections, like Set, List, Queue.
        // Map is unordered.
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("lemon", 17);
        fruitCalories.remove("lemon");

        System.out.println(fruitCalories);
        System.out.println("banana calories: " + fruitCalories.get("banana"));
        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));

        Map immutableFruitCalories = Map.of(
                "apple", 95,
                "lemon", 20
        );

        // Map doesn't have access to iterator, since it's not a Collection.
        // but Set does.
        Set mapEntries = fruitCalories.entrySet();
        var i = mapEntries.iterator();

        while(i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // Enhanced For Loop
        for (Map.Entry calorieInfo : fruitCalories.entrySet()) {
            System.out.println(calorieInfo.getKey() + ": " + calorieInfo.getValue());
        }

        fruitCalories.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
