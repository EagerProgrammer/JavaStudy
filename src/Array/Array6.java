package Array;

public class Array6 {
    public static void main(String[] args){
    String s = "12341";
    String x= "2";
    char[] arr1 =  s.toCharArray();
    int[] arr2 = new int[arr1.length];
    char[] arr3 =  x.toCharArray();
    int[] arr4 = new int[arr3.length];
    for(int i=0; i < arr1.length; i++){
        arr2[i] = Integer.parseInt(String.valueOf(arr1[i]));
    }
    for(int j=0; j < arr3.length; j++){
        arr4[j] = Integer.parseInt(String.valueOf(arr3[j]));
    }
    for(int k=-0; arr2.length < arr4.length ? (k < arr4.length): (k < arr2.length); k++){
       //for(int j =0; arr4.length < arr2.length ? (j < arr4.length) : (j))
    }


    }

    }

