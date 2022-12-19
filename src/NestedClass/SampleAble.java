package NestedClass;

//인터페이스 안에 속성을 만들면 final 변수가 됩니다.
//인터페이스 안에 메서드를 만들면 abstract 메소드가 됩니다.
//인터페이스 안에 메서드를 만들 때 내용을 추가하고자 하면 default라는 키워드를 추가해야합니다.
//인터페이스는 인스턴스 생성 못함 - 변수 생성은 가능
//클래스에 implements해서 사용
public interface SampleAble {
    //자동적으로 추상 메소드
    //추상 메서드는 하위 클새스에서 반드시 재정의를 해야합니다.
    public void method1();

}
