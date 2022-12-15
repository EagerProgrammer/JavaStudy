package OOP;

public class MethodClass {
    private static int num;
    private String name;

    //static method
    public static void method1() {
        num = 1;
        //static 메서드에서는 instance 속성이 안됨
        //name ="adam";
        System.out.println("static method");
    }
    public static int noRecursionFibonacci(int n){
        int n_1 = 1;
        int n_2 = 1;

        int fibo = 1;
        //규칙이 3번째부터 적용
        int i = 3;
        while(i <= n){
            fibo = n_1 +n_2;
            //n_1과  n_2을 이동
            n_2 = n_1;
            n_1 = fibo;
            i=i+1;
        }
        return fibo;
    }
    //instance method
    public void method2() {
        num = 1;
        name = "adam";
        System.out.println("instance method");
    }

    //static: 인스턴스를 생성할 필요가 없음
    //매개변수가 없음
    //MethodClass.noArgsMethod()로 호출
    public static void noArgsMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("method");
        }
    }

    //매개변수가 정수 1개인 메서드
    //MethodClass.oneArgsMethod(3)
    public static void onArgsMethod(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("method");
        }
    }

    //리턴이 없는 메서드는 연속해서 호출하는 것이 불가능
    //2개의 정수를 받아서 더해주는 메서드
    public int addWithInteger(int first, int second) {
        return first + second;
    }

    //아래의 두개가 overloading의 예 메소드의 이름은 같을 수 있으나 매개변수의 갯수 밑 자료형이 다르다.
    public void display() {
    }

    public void display(int a) {
    }

    public static void callByValue(int n) {
        n = n + 1;
        System.out.println("n:" + n);
    }

    public static void callByreference(int[] ar) {
        ar[0] = ar[0] + 1;
        System.out.println("ar[0]:" + ar[0]);
    }

    class T {
        public int num;

        public void method(T this) {
            int x = 20;
            //num은 메서드 안에서 만든 지역변수가 아니므로 this를 추가
            System.out.println(num);
            System.out.println(x);
        }

    }

    public int score = 100;

    public void thisMethod() {
        int score = 200;
        //scope의 법칙 정용 - 가까이에서 만든 것을 사용
        System.out.println("score:" + score);//200
        //인스턴스가 가진 score 호출
        //this가 붙으면 메서드 안에서는 찾지 않음
        System.out.println("this.score:" + this.score);
    }
    public static int recursionFibonacci(int b){
        if(b == 1 || b==2) {
            return 1;
        }
        return recursionFibonacci(b-1)+recursionFibonacci(b-2);
    }
    public static void display(String ...args){
        for(String temp : args){
            System.out.println(temp);
        }
    }


}

