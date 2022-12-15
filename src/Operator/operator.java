package Operator;

import OOP.Student;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        System.out.println(10 > 3);
        //정수끼리는 자료형이 달라도 크기 비교는 가능
        System.out.println(10 > 10L);
        System.out.println(10L > 10);
        //실수는 크기 비교에서도 정확한 결과를 만들어내지 못할 수 있음
        System.out.println((1.0 - 0.8) >= 0.2);


        String s1 = "JAVA";
        String s2 = "JAVA";
        System.out.println(s1 == s2);
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하시오");
        //문자열을 입력받아서 생성 - 리터럴이 만든 것이 아니여서 해시코드가 다름
        String s3 = scanner.nextLine();
        System.out.println(s3);
        System.out.println(System.identityHashCode(s3));
        System.out.println(s1 == s3);//해쉬 코드가 달라서 false
        //인스턴스의 경우는 equals로 내용을 비교
        System.out.println(s1.equals(s3));
        int [][] sizes = {{1,2}, {3,4}};
        for(int [] arr : sizes){
            System.out.println(arr);}
    }
}