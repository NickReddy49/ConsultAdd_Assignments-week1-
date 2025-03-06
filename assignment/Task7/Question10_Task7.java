package com.assignment.Task7;

import java.util.*;
public class Question10_Task7 {
    public static void main(String args[])throws Exception {
    HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Mango");
        map.put(2, "Banana");
        map.put(5, "Grapes");
        map.put(4, "Orange");

    //Sorting by keys using TreeMap
    TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

    System.out.println("HashMap sorted by keys: " + sortedMap);

        HashMap<Integer, String> otherMap = new HashMap<>();
        otherMap.put(3, "Apple");
        otherMap.put(1, "Mango");
        otherMap.put(2, "Banana");
        otherMap.put(5, "Grapes");
        otherMap.put(4, "Orange");

        //Convert HashMap into List of Map Entries
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(otherMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        //Create a LinkedHashMap to store sorted values
        LinkedHashMap<Integer, String> sortMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : entryList) {
            sortMap.put(entry.getKey(), entry.getValue());
        }

        //Print sorted map
        System.out.println("HashMap sorted by values: " + sortMap);
  }
}
