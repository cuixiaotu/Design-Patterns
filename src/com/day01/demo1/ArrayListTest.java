package com.day01.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ArrayListTest {
    //private static List<List<Integer>> data = new ArrayList<>();

    public static void main(String[] args) {
/*
        for (int i = 0; i < 10; i++) {
            List<Integer> rawList = IntStream.rangeClosed(1, 9).boxed().collect(Collectors.toList());
            data.add(new ArrayList<>(rawList.subList(0, 1)));
        }
        System.out.println(data);
*/


        String[] arrays = {"1", "2", "3","4"};
        List<String> list = new ArrayList<>(Arrays.asList(arrays));

//        Iterator<String>  iterator = list.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals("1")){
//                iterator.remove();
//            }
//        }

//        list.removeIf(str->str.equals("1"));


        for (String str : list) {
            System.out.println(str);

            if (str.equals("3")) {
                list.remove(str);
            }
            System.out.println(str);

        }

        System.out.println(list);


    }

}
