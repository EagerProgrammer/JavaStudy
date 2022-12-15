package Array;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class Sorting {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arr1));
        String[] ar = {"레지밀러", "쿨쿨자", "에드워드"};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
