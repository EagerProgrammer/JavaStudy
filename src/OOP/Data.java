package OOP;

public class Data {
    private int num;
    private String name;

    public int sequence;

    public Data(){
        super();
        //sequence를 num에 대입하고 1증가
        num = ++sequence;
    }

    public Data(String name) {
        super();
        this.num = ++sequence;
        this.name = name;
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

    @Override
    public String toString() {
        return "Data{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
