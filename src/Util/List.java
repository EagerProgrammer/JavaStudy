package Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class List {

    public static void main(String[] args){
        java.util.List<Integer> al = new ArrayList<>();
         java.util.List<Integer> li = new LinkedList<>();

         al.add(1);
         al.add(3);

         li.add(1);
         li.add(3);

         //for(int i =0; i <100000; i++){
             //al.add(i);
             //li.add(i);
         //}
         long start;
         long end;
         start = System.currentTimeMillis();
         for(int i=0; i<10000000; i++){
             al.add(1,2);
         }
         end = System.currentTimeMillis();
         System.out.println("Arraylist 중간에 추가하는 시간:"+ (end-start));
        start = System.currentTimeMillis();
        for(int i=0; i<100; i++){
            li.add(1,2);
        }
        end = System.currentTimeMillis();
        System.out.println("Linkedlist 중간에 추가하는 시간:"+ (end-start));

        java.util.List<String> list = new ArrayList<>();

        list.add("점심");
        list.add("배고파");
        list.add("머먹지");
        list.add("안녕");
        list.add("프젝");

        for(String temp : list){
            System.out.println(temp);
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }
}
