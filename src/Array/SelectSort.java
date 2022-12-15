package Array;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args){
        int[] arr1 = new int[10];
        for(int i=0; i <arr1.length; i++){
            arr1[i] = (int)((Math.random()*11)+1);
        }
        System.out.println(Arrays.toString(arr1));
        for(int j=0; j <arr1.length-1; j++){
            for(int k=j+1; k < arr1.length; k++){
                if(arr1[j] > arr1[k]){
                    int temp = arr1[j];
                    arr1[j] = arr1[k];
                    arr1[k] = temp;
                }
            }
        }System.out.println(Arrays.toString(arr1));

        String s = "banana";
        int[] answer = {};
        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j <= i; j++){
                if(arr[i] == arr[i-j]){
                    answer[i] = j;
                }
                else{
                    answer[i] = -1;
                }

    }


}
    }}
