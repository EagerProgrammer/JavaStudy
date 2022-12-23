package iO;

import java.io.*;

public class SerializableMain {

    public static void main(String[] args){
        //인스턴스 단위로 기록 할 수 있는 스트림 생성
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sample.dat"))){
            //기록한 인스턴스 생성
            Data2 data2 = new Data2(1,"adam","군계");
            oos.writeObject(data2);
            oos.flush();

        }catch (Exception e){System.out.println(e.getLocalizedMessage());}



        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream("sample.dat")))){
            Data2 data2 = (Data2) ois.readObject();
            System.out.println(data2);

        } catch (Exception e){System.out.println(e.getLocalizedMessage());}
    }}
