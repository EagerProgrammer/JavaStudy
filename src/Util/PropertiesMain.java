package Util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Properties;

public class PropertiesMain {

    public static void main(String[] args) throws IOException {
        //인스턴스를 1개만 만들때 참조하는 이름은 클래스 이름을 그대로 작성하고 첫글자만 소문자로 변경
        //이 방법이 Spring이 bean을 만들 때 사용하는 방법
        Properties properties = new Properties();

        //데이터 저장
        properties.setProperty("num", "1");
        properties.setProperty("name","adam");

        //읽어오기
        System.out.println(properties.getProperty("num"));
        System.out.println(properties.getProperty("name"));

        //반복자 사용
        Enumeration <Object> keys = properties.keys();

        while (keys.hasMoreElements()){
            System.out.println(keys.nextElement());
        }

        //파일로 저장
        properties.store(new FileOutputStream("./pro.properties"), "텍스트로 저장");
        properties.store(new FileOutputStream("./pro.xml"), "XML로 저장");
}}
