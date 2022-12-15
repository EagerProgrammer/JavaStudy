package controlstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        /*try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("입력하세요");
            String str = br.readLine();
            System.out.println(str);
            String age = br.readLine();
            int nai = Integer.parseInt(age);
            System.out.println(nai);

        } catch (IOException e) {
           System.out.println(e.getLocalizedMessage());
        }*/
        try (Scanner sc = new Scanner(System.in)) {
            //숫자 문자열 순서 조심해야함 Scanner쓸때
            //숫자를 입력받고 문자열을 입력받는 경우에는 앞에 입력한 Enter를 제거하기 위해 한 번 더 호출
            System.out.println("이름을 입력하세여");
            String name = sc.nextLine();
            System.out.println("나이 입력");
            int age = sc.nextInt();
            System.out.println(name + ":" + age);
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
    }
}}
