package Util;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //정수 배열
        int[] ar = {60, 20, 30, 40, 87};
        //문자열 배열
        String[] br = {"혜린", "령", "뉴진스", "회식", "메뉴","머임"};
        //배열의 데이터 확인
        System.out.println(Arrays.toString(ar));
        //정수 배열 정렬
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));

        Arrays.sort(br);
        System.out.println(Arrays.toString(br));

        //V0 클래스의 인스턴스 5개를 소유하는 배열
        V0[] datas = new V0[5];
        datas[0] = new V0(1,"배수지",28);
        datas[1] = new V0(2, "이지은", 29);
        datas[2] = new V0(3,"배주현", 31);
        datas[3] = new V0(4, "박수영", 26);
        datas[4] = new V0(5,"유지민", 22);
        System.out.println(Arrays.toString(datas));

        Arrays.sort(datas);
        System.out.println(Arrays.toString(datas));
    }
}
