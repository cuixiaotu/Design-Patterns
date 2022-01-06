package com.day01.demo1;

import java.util.*;
import java.util.stream.Collectors;

public class hanshu {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("bilibili");
        list.add("of");
        list.add("cuiixiaotu");
        list.add("5");
        list.add("at");
        list.add("BILIBILI");
        list.add("cuixiaotu");
        list.add("18");
        list.add("CHEERS");

        String result = list.parallelStream().filter(s -> !isNum(s)).filter(s -> s.length()>5).map(s->s.toLowerCase()).distinct()
                .sorted(Comparator.naturalOrder()).collect(Collectors.joining("❤"));

        System.out.println(result);
    }

    public static void main1(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("bilibili");
        list.add("of");
        list.add("cuiixiaotu");
        list.add("5");
        list.add("at");
        list.add("BILIBILI");
        list.add("cuixiaotu");
        list.add("18");
        list.add("CHEERS");

        Set<String> stringSet = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareTo(o2);
                    }
                }
        );

        for (int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
            if (!isNum(s) && s.length() >=5){
                String sLower = s.toLowerCase();
                stringSet.add(sLower);
            }
        }

        StringBuilder result = new StringBuilder();
        for ( String s : stringSet){
            result.append(s);
            result.append("❤");
        }
        //System.out.println(result);

        String finalResult = result.substring(0,result.length()-1);
        System.out.println(finalResult);
    }



    public static Boolean isNum(String str){
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

}

