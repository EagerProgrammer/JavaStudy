package OOP;

public class Main {
    public static void main(String[] args){
        /*Student student = new Student();
        student.kor = 1;
        student.name = "배고파";
        student.num = 17;
        student.mat = 4124;
        System.out.println(student.name);

        Student student1 = new Student();
        student1.num = 2;
    student.SchoolName= "개배고파";
    student1.SchoolName = "나도";
    System.out.println(student.SchoolName);
    System.out.println(student1.SchoolName);*/
        //static method는 클래스 이름으로 호출 가능
    MethodClass.method1();
    //instance method는 인스턴스로 객체를 만든 후 호출 가능
    MethodClass methodClass = new MethodClass();
    methodClass.method2();
    methodClass.method1();
    //참조형 변수를 만들지 않고 인스턴스를 만들어 메서드 호출
        //한번만 사용하는 인스턴스는 이름을 만들지 않는 것이 좋습니다.
    new MethodClass().method2();

    MethodClass.noArgsMethod();
    //리턴된 결과 가져오기
    int result = methodClass.addWithInteger(1,4);
    System.out.println(result);
    int x = 10;
    MethodClass.callByValue(x);
    //기본형을 메서드에게 넘겨준 경우는 데이터가 변경되지 않음
    System.out.println("x:" + x);

    int[] br = {1,2,3};
    MethodClass.callByreference(br);
    //배열을 메서드에게 넘기면 배열의 내용이 변경될 수 도 있음
        //메서드이 리턴이 없는 경우라면 print메서드를 제외하고는
        //원본을 변경해주는 것입니다.
    System.out.println("br[0]:"+br[0]);

    methodClass.thisMethod();
    int six = MethodClass.noRecursionFibonacci(10);
    System.out.println(six);
    int seven = MethodClass.recursionFibonacci(40);
    System.out.println(seven);
    MethodClass.display("안녕", "프젝해야지","저녁은 언제먹음");
    MethodClass.display("아","몰랑","집에 갈래");
    }



}
