package Network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPclient {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            while (true){
                System.out.println("보낼 메세지:");
                String msg = sc.nextLine();
                //보낼 곳의 IP 생성
                InetAddress addr = InetAddress.getByName("192.168.0.173");
                //소켓 생성
                DatagramSocket ds = new DatagramSocket();
                DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, 7777);
                ds.send(dp);
ds.close();} }catch (Exception e){System.out.println(e.getLocalizedMessage());}
    }
}
