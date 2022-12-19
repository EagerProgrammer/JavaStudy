package NestedClass;

public class Main {
    public static void main(String[] args){
        //외부 클래스의 인스턴스를 생성
        Instanceinner instanceinner = new Instanceinner();
        //내부 클래스의 인스턴스 생성 - instance inner인 경우
        //Instanceinner.inner obj = instanceinner.new inner();
        //Static inner인 경우 인스턴스 생성
        Instanceinner.inner obj = new Instanceinner.inner();
        //상위 클래스나 인터페이스로 만들어진 변수에
        //하위 클래스의 인스턴스 참조를 대입 할 수 있습니다.
        //이렇게 만들어진 변수는 상위 클래스나 인터페이스에 존재하는 이름만 호출이 가능
        //실제 호출되는 것은 생성자를 따라 갑니다.
       SampleAble instance = new SampleAbleimp();
       instance.method1();
       //Anonymous Class 사용
        SampleAble anonymous =new SampleAble(){

            @Override
            public void method1() {
                    System.out.println("니가 만든 쿠키");
            }
        };
        anonymous.method1();
        //메서드를 1번 만 호출할 거라면 변수를 생성하지 않고 가능
         new SampleAble() {
             @Override
             public void method1() {
                    System.out.println("어텐션~~~~~");
             }
         }.method1();
         //public 클래스에  public static 속성은 어느곳에서나 호출 가능
         GlobalData.global = 10;

         //Singleton singleton = new Singleton();
        //Singleton singleton1 = new Singleton();
        Singleton singleton1 = Singleton.sharedInstance();
        Singleton singleton2 = Singleton.sharedInstance();

        System.out.println(System.identityHashCode(singleton1));
        System.out.println(System.identityHashCode(singleton2));

        Table row1 = new Table();
        System.out.println(row1.getNum());
        Table row2 = new Table();
        System.out.println(row2.getNum());
        Table.setStep(10);
        Table row3 = new Table();
        System.out.println(row3.getNum());
}}
