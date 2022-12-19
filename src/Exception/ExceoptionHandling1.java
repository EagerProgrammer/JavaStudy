package Exception;

public class ExceoptionHandling1 {
    //이 메서드를 다른 곳에서 호츌 할 때는 ArithmeticException을 핸들링 해야합니다.
    //실제로는 이 메서드 안에서 ArithmeticException이 발생할 상황이 있어야합니다.
    public static void  exception() throws ArithmeticException{

        int kor =10;
        int eng =99;
        if(kor > 100 || eng > 100){
            throw  new ArithmeticException("점수는 100보다 작거나 같아야함");
        }
        double avg = (kor + eng) / 2;
        System.out.println(avg);
    }
    public static void main(String[] args) throws InterruptedException {
        exception();
        //Thread의 클래스의 sleep이라는 메서드는 지정한 시간동안 현재 스레드의 수행을 중지하는 역할을 해주는 메서드 입니다.
        //원래 이메서드는 public static void sleep(long millis) throws interreuptedException이므로
        //이 메서드를 사용할 때는 interrupted Exception을 처리해야함
        /*try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }*/
        Thread.sleep(3000);

    }
}
