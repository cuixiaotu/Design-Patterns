package com.day01.demo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.*;

public class MapTest {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("1",1);
        map.put("2",2);
        map.put("3",3);

        Collection<Integer> collection = new ArrayList<>(map.values());
        map.put("4",4);

        //

        collection.clear();


        System.out.println(map);
        System.out.println(collection);
    }


}
