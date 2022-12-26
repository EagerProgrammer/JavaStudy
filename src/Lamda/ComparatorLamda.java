package Lamda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLamda {
    public static void main(String[] args){
        //데이터 정렬을 위해서 문자열 배열 생성
        String[] ar = {"야구","축구","농구","배구","당구"};

        /*Arrays.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/
        //람다를 이용해서 하기 코드는 간결해졌지만 가독성이 떨어집니다.
        Arrays.sort(ar, (o1,o2)-> o2.compareTo(o1));
        System.out.println(Arrays.toString(ar));
    }
}
