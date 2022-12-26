package Network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

    public static void main(String[] args){
        new Thread(){
            public void run(){
                try{
                    String addr = "https://www.google.com/imgres?imgurl=https%3A%2F%2Fblogthumb.pstatic.net%2F20111212_232%2Fstpetro_1323699813676UMsM3_JPEG%2FIMG_6671.JPG%3Ftype%3Dw2&imgrefurl=https%3A%2F%2Fblog.naver.com%2FPostView.naver%3FblogId%3Dstpetro%26logNo%3D150126451794%26redirect%3DDlog%26widgetTypeCall%3Dtrue%26directAccess%3Dfalse&tbnid=87iS9UEUVZt0wM&vet=12ahUKEwj8gIbmqpb8AhUQB5QKHV_cD6AQMygFegUIARDZAQ..i&docid=LXX5WubvAjIx8M&w=740&h=408&q=%EB%A7%8C%EC%9E%AC%EB%8F%84&ved=2ahUKEwj8gIbmqpb8AhUQB5QKHV_cD6AQMygFegUIARDZAQ";
                    // .은 \와 함께 기재해야 합니다.
                    String [] ar = addr.split("\\.");
                    String ext = ar[ar.length-1];
                    System.out.println(ext);
                    URL url = new URL(addr);
                    HttpURLConnection con = (HttpURLConnection)url.openConnection();
                    con.setConnectTimeout(30000);
                    con.setRequestMethod("GET");
                    con.setUseCaches(false);

                    //바이트 스트림 생성
                    InputStream in = con.getInputStream();
                    File f = new File("dunamu." +ext);
                    if(f.exists()){
                        System.out.println("이미 파일이 존재합니다.");
                        return;
                    }
                    //읽은 내용을 저장한 파일 스트림을 생성
                    FileOutputStream fos = new FileOutputStream("dunamu." + ext);
                    while (true){
                        //데이터를 저장한 바이트 배열 생성
                        byte [] raster = new byte[512];
                        //바이트 배열에 읽어서 저장
                        int len = in.read(raster);
                        //읽은 데이터가 없으면 종료
                        if(len == 0){
                            break;
                        }
                        //읽은 내용을 파일에 기록
                        fos.write(raster,0 ,len);
                    }
                    in.close();
                    fos.close();
                    con.disconnect();
            }catch (Exception e){
                    System.out.println(e.getLocalizedMessage());
                }
        }
    }.start();
}}
