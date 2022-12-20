package Lang;

import java.util.Arrays;
import java.util.Objects;
public class Data {
    private int num;
    private String name;
    private String [] nicknames;

    public Data(int num, String name, String[] nicknames) {
        super();
        this.name = name;
        this.num = num;
        this.nicknames = nicknames;
    }

    public Data() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNicknames() {
        return nicknames;
    }

    public void setNicknames(String[] nicknames) {
        this.nicknames = nicknames;
    }
    //인스턴스의 내용을 빠르게 만들기 위해서 사용
    //디버깅을 위한 메서드
    @Override
    public String toString() {
        return "Data{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", nicknames=" + Arrays.toString(nicknames) +
                '}';
    }
    //자바는 복제를 이용하고자 하는 경우 clone 메서들를 재정의 해야합니다.
    //재정의할 때 Cloneable 인터페이스를 implements 하기를 권장합니다.
    public Data clone(){
        Data original = new Data();
        original.setNum(this.num);
        original.setName(this.name);
        original.setNicknames(this.nicknames);

        return original;

}
    @Override
    //데이터 내용이 같은지 확인하는 메서드
    public boolean equals (Object other){
        boolean result = false;
        Data other1 = (Data)other;
        //숫자나 불린은 ==일치 여부를 판단하지만
        //나머지 자료형은 equal 판단
        if(this.num == other1.getNum() && this.name == other1.getName()){
            return true;
        }
        //Objects.hash(데이터 나열)을 이용하면
        //데이터를 가지고 정수로 만든 해시코드를 생성 이렇게 만들어서 코드값을 리턴하는 것이 더 빠릅니다.
        System.out.println(Objects.hash(num, name));
        System.out.println(Objects.hash(other1.getNum(), other1.getName()));
        return (Objects.hash(num,name))==Objects.hash((other1.getNum()), other1.getName());

    }
}


