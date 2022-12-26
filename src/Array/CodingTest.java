package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTest {
    public static void  main(String[] args){
       String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
       int len = report.length;
        ArrayList<String> list = new ArrayList<>();
        String[] arr1;
        for(int i = 0; i < len; i++){
            arr1 = report[i].split(" ");
        }
        //System.out.println(Arrays.toString(arr1));

    }
}
