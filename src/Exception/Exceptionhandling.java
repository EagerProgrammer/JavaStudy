package Exception;

public class Exceptionhandling {
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        try {
        System.out.println(i/j);}
        //catch가 여러개이면 일치하는 catch 블럭의 내용을 처리고 다른 catch는 pass
        //상위 클래스의 참조형 변수에는 하위 클래스 인스턴스 참조를 저장할 수 있기 때문에 catch를 여러개 작성할 때 주의해야합니다.
        //상위 클래스의 예외처리 먼저 만들고 아래에 하위 클래스의 예외처리 구문을 만들면 컴파일 에러 아래 예외 처리 구문이 Dead Code가 됨
        catch (NullPointerException e){
            System.out.println("Null이 속석이나 메서드를 호출하면 예외 발생");
        }
        catch (ArithmeticException e){
            //예외가 발생했을 때 수행할 내용
            //예외가 발생하지 않은면 수행되지 않음

            System.out.println("0으로 나누면 안됩니다.");
        }finally {
            System.out.println("카카오 가즈아잉");
        }

    }
}
