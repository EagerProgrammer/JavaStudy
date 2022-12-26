package Network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class WebTextDownload {
    public static void main(String[] args){
        try{//주소 정보 가져오기
            InetAddress ia = InetAddress.getByName("www.kakao.com");
            //연결 - 소켓 생성
            Socket socket = new Socket(ia,80);
            //요청 전송할 수 있는 스트림 생성
            PrintWriter ps = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream())));
            //요청전송
            ps.println("GET https://www.kakao.com");
            ps.flush();


            //문자단위로 전송을 받기 위한 스트림 생성
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            StringBuilder sb = new StringBuilder();
            while (true){
                String imsi = br.readLine();
                if(imsi == null){
                    break;
                }
                sb.append(imsi + "\n");
            }
            String html = sb.toString();
            System.out.println(html);
            //사용한 자원 정리
            br.close();
            ps.close();
            socket.close();
        }catch (Exception e){System.out.println(e.getLocalizedMessage());e.printStackTrace();}
    }
}
