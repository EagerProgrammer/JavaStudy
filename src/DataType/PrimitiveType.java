package DataType;

public class PrimitiveType {
    public static void main(String[] args){
        int x = 100;
        System.out.println("x:" + x);

        int y = 100;
        //identityHashcode를 통해 참조하고 있는 위치를 알 수 있다.//
        System.out.println("x:" + System.identityHashCode(x));

        System.out.println("y:" + System.identityHashCode(y));
    }
}
