package Util;

class Sharedata implements  Runnable {
    private int result;
    private int idx;

    public int getResult() {
        return result;
    }

    //private synchronized void sum(){} 메소드를 동기화 처리
    private void sum() {
        for (int i = 0; i < 1000; i++) {
            //이 영역 내에서는 다른 작업이 this를 사용할 수 없음
            synchronized (this){
            idx = idx + 1;
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            result = result + idx;
        }}
    }

    @Override
    public void run() {
        sum();
    }
}
    public class Mutexmain{

    public static void main(String[] args){
        Sharedata data = new Sharedata();
        Thread th1 = new Thread(data);

        th1.start();
        Thread th2 = new Thread(data);
        th2.start();
        try {
            Thread.sleep(5000);
            System.out.println(data.getResult());
        }catch (Exception e){}
        }
    }

