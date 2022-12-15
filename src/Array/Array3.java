package Array;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args){
        String[] ar = {"레지밀러", "에드워드 듀크", "쿨쿨자"};
        String[] br = new String[ar.length];
        for(int i=0; i<ar.length; i++){
            br[i] = ar[i];
        }
        System.out.println(Arrays.toString(br));

        String[] cr = Arrays.copyOf(ar, ar.length+1);
        cr[3] = "특강";
        System.out.println(Arrays.toString(cr));


    }
}
