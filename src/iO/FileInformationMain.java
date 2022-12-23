package iO;

import java.io.File;
import java.util.Date;

public class FileInformationMain {

    public static void main(String[] args
    ){
        //file객체 생성
        File f = new File("C:\\Java\\javafirst");

        //파일 존재여부 확인
        if(f.exists() == true){
            System.out.println("파일의 크기:" + f.length());
            System.out.println("마지막 수정 날짜" + f.lastModified());
            Date date = new Date(f.lastModified());
            System.out.println("마지막 수정날짜:"+date);
        }else {
            System.out.println("파일이 존재하지 않습니다.");
        }
}}
