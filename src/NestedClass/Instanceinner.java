package NestedClass;

public class Instanceinner {
    //내부 클래스의 특성에 static이 추가 되면
    //외부에서 인스턴스를 만들때 클래스 이름.new 내부 클래스 이름()의 형태로 가능합니다.
    //안드로이드에서 뷰의 이벤트를 처리하기 위한 인터페이스들이 이런 방식으로 설계됨
    public static class inner{
        public int score;
        //내부 클래스에 static 멤버가 존재하면 클래스의 특성에 static을 추가해줘야 합니다.
        public static int auto;

    }
}
