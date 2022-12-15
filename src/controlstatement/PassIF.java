package controlstatement;

import java.util.Scanner;

public class PassIF {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("아이디");
            String id =  sc.nextLine();
            System.out.println("비밀번호 치셈");
            String password = sc.nextLine();
            if(id.equals("root") && password.equals("1234")){
                System.out.println("로그인 성공");
            }else{System.out.println("꺼져");}
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
