package Thread;


import java.util.Set;
import java.util.concurrent.Semaphore;

class SemaphoreThread implements Runnable{
    private Semaphore semphore;
    private String message;

    public SemaphoreThread(Semaphore semphore, String message) {
        this.semphore = semphore;
        this.message = message;
    }
    public void run(){
        try{
            semphore.acquire();
            System.out.println(message);
            Thread.sleep(10000);
        }catch (Exception e){}
        //공유자원 해제
        semphore.release();
    }
}
public class SemphoreMain {

    public static void main(String[] args){
        //동시에 실행될 수 있는 스레드의 개수를 설정하는 클래스
        //동시에 여러개의 스레드가 수행될 상황에서
        //성능 저하를 막기 위해서 사용
        Semaphore semaphore = new Semaphore(2);
        new Thread(
                new SemaphoreThread(semaphore, "1")).start();
        new Thread(
                new SemaphoreThread(semaphore, "2")).start();
        new Thread(
                new SemaphoreThread(semaphore, "3")).start();
        new Thread(
                new SemaphoreThread(semaphore, "4")).start();

    }
}
