package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args){
        String[] arr1 = {"섹스", "여자", "모텔"};
        for(int i=0; i < arr1.length; i++){
            String str = arr1[i];
            System.out.println(str);
        }
        for(String out : arr1){
            System.out.println(out);
        }
        String[][] arr2 = {{"남자","여자"}, {"클스마스","루돌프"}, {"정훈","아섹스.."}};
        for(String[] arr3 : arr2){
            System.out.println(Arrays.toString(arr3));
        }
        int count =0;
        int count2 = 0;
        for(String s : "xyx".split("")) {
            if (s.equals("x")) {
                count++;
            }else{ count2 = -1;}
    }
        int[] newreal = new int[3];
        for(int i= 0; i < newreal.length; i++){
            newreal[i] = count;
        }
}}
