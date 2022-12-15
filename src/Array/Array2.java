package Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args){
        String [][] programmers = {{"저녁","머먹지","배민"}, {"점심","만둣국","존맛탱"},{"특강","존나","듣기싫다"}};
        System.out.println(programmers.length);
        System.out.println(programmers[0].length);
        for(String[] arr1 : programmers){
            System.out.println(Arrays.toString(arr1));
        }
    }
}
