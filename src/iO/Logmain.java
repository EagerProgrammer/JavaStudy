package iO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Logmain {

    public static void main(String[] args){
        //파일 경로 확인
        File file = new File("log.txt");
        System.out.println(file.exists());

        //문자열 읽기 위한 스트림을 생성
        try(BufferedReader br = new BufferedReader(new FileReader("log.txt"))){
            //트래픽의 합계를 구할 변수
            int sum = 0;


            //줄 단위로 읽어서 출력
            while (true){
                String log = br.readLine();
                if(log==null){break;}
                System.out.println(log);
                String [] ar = log.split(" ");
                //IP확인
                //System.out.println(ar[0]);
                //트래픽 확인
                //System.out.println(ar[ar.length-1]);
                try {
                    sum = sum + Integer.parseInt(ar[ar.length-1]);
                }catch (Exception e){}
            }System.out.println(sum);



        }catch (Exception e){System.out.println(e.getLocalizedMessage());}
    }
}
