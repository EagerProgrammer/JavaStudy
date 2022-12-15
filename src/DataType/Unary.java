package DataType;

import static java.lang.System.*;

public class Unary {
    public static void main(String[] args){
        int n1 = 20;
        int n2 = -20;
        //정수 데이터가 2진수로 저장된 구조를 출력
        out.println("n1 :" + Integer.toBinaryString(n1));
        out.println("n2 :" + Integer.toBinaryString(n2));
        //1의 보수 구하기 + 21
        out.println("~n2 :" + Integer.toBinaryString(~n2));

        double d = 0.1;
        double tot = 0.0;
        for(int i=0; i <100;  i++){
            tot = tot + d;
        }
        //0.1을 100번 더했는데 9.99999999998임
        out.println(tot);

        //나누기 연산에서의 나누는 수 확인
        //0으로 나누는 것이 에러가 아닐 수 있음
        out.println(5/0.0);



    }
}
