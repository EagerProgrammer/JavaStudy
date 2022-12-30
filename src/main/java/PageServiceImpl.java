import javaweb.PageService;

public class PageServiceImpl implements PageService {
    //java이면 싱글톤 패턴 작성 코드를 추가 - Spring에서는 불필요
    @Override
    public int add(int first, int second) {
        return first + second;
    }
}
