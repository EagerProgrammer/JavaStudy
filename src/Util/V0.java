package Util;

public class V0 implements Comparable<V0>{
    private int num;
    private String name;
    private int age;

    public V0() {
        super();
    }

    public V0(int num, String name, int age) {
        super();
        this.num = num;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "V0{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //크기비교하는 메서드
    //양수를 리턴하면 순서가 변경되고 0이나 음수가 리턴되면 순서안바꾸미
    @Override
    public int compareTo(V0 o) {
        //숫자는 뺄셈을 해서 리턴하면 됩니다.
        //순서를 변경하면 내림차순이 됩니다.
            //return this.age - o.age;
        //문자열은 뺄셈이 안됩니다.
        //return  this.name - o.name;
        //문자열은 Comparable 인터페이스르 implements 했기 때문에
        //CompareTo메서드로 비교하면 됩니다.
        return this.name.compareTo(o.name);
    }
}
