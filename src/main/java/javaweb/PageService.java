package javaweb;

//사용자의 요청을 처리할 메서드의 원형을 가진 인터페이스
public interface PageService {
    //2개의 정수 받아서 합꼐 구하고 리턴하는 메서드
    public int add(int first, int second);
}