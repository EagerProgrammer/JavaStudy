package iO;

import java.io.*;
import java.util.Arrays;

public class ByteStreamMain {
    public static void main(String[] args) {
        /*try (FileOutputStream fos = new FileOutputStream("./sample.txt",true)){
            //파일에 기록
            String msg = "Hello JAVA";
            fos.write(msg.getBytes());
            fos.flush();
            fos.close();

        }catch (Exception e){System.out.println(e.getLocalizedMessage());}
    }*/

    /*try(FileInputStream fis = new FileInputStream("./sample.txt")){
        while (true){
            byte [] b = new byte[fis.available()];
            int len = fis.read(b);
            if(len <= 0){
                System.out.println("읽은 데이터 없음");
                break;
            }else {System.out.println(Arrays.toString(b));
                System.out.println(new String(b));

            //int x = fis.read(); if(x== -1){break;} System.out.println((char)x)};
        }

    }}catch (Exception e){System.out.println(e.getLocalizedMessage());}*/
    //버퍼단위로 기록
        try(PrintStream printStream = new PrintStream(new FileOutputStream("./sample.txt",true))){
            String msg = "안녕하세요";
            //write는 바이트 단위 기록
            printStream.write(msg.getBytes());
            //print는 문자열 스스로 바이트로 변환해서 기록
            printStream.print(msg);
            printStream.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./sample.txt"))) {
            //나누어서 읽기 - 웹이서 파일 다운로드 받을 때 사용
            //byte [] b= new byte[bis.available()];
            while (true){
                //파일에서 읽을 수 있는 크기로 바이트 배열을 생성
                //byte [] b= new byte[bis.available()];


                //16바이트 단위로 읽어오기
                byte [] b = new byte[1024];
                int len = bis.read(b, 0, b.length);
                if(len <=0){
                    break;
                }
                //받을 내용을 가지고 작업
                //다운로드라면 파일에
                System.out.println(Arrays.toString(b));
                System.out.println(new String(b, 0 ,len));
                System.out.println((new String(b)).trim());


                //읽기
                //int len = bis.read(b);
                //읽은게 없으면 종료
                //if(len <= 0 ){
                 //break;
                //}
                //System.out.println(Arrays.toString(b));
                //문자열로 변환
                //System.out.println(new String(b));
            }} catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    catch (Exception e){System.out.println(e.getLocalizedMessage());
        };

    }
}
