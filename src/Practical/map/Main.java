package Practical.map;

import javax.naming.Name;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main (String[] args){



        HashMap<String,Integer> toys = new HashMap<>();

        toys.put("dog",1);
        toys.put("cat",2);
        toys.put("rabbit",3);
        toys.put("pig",4);
        toys.put("tiger",5);

        Set<String> keySet = toys.keySet();
        System.out.println(keySet);
        System.out.println("--------------");
        Collection<Integer> values = toys.values();
        System.out.println(values);
        System.out.println("--------------");

       Set<Map.Entry<String,Integer>> entries = toys.entrySet();

        System.out.println(entries);
        System.out.println("--------------");
        Iterator<Map.Entry<String,Integer>>iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer>next = iterator.next();
            System.out.println(next);
        }









    }
}
