package Network;

import java.net.InetAddress;
import java.util.Arrays;

public class IpInformation {

    public static void main(String[] args){
        try{
            //자신의 ip확인
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println(localhost);
            //도메인을 가지고 IP정보 확인

            InetAddress [] naver = InetAddress.getAllByName("www.naver.com");
            System.out.println(Arrays.toString(naver));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());}
        }
    }

