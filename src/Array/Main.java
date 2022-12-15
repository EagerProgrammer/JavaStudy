package Array;

import java.io.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args) throws Exception {
        String s = "foobar";
        int[] answer = new int[6];
        char[] arr = s.toCharArray();
        answer[0] = -1;
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j <= i; j++){
                if(arr[i] == arr[i-j]){
                    answer[i] = j;
                    break;
                }
                else{
                    answer[i] = -1;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}