package controlstatement;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("메뉴 입력 1~3");
            int menu = sc.nextInt();
            switch (menu){
                case 1 :
                    System.out.println("햄버거");
                    break;
                case 2 :
                    System.out.println("피자");
                    break;
                case 3:
                    System.out.println("라멘");
                    break;
                default:
                    System.out.println("편의점 도시락");
                    break;
            }
        }
    }
}
