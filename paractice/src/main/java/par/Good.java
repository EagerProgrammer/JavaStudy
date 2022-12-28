package par;

public class Good {
    private String code;
    private String name;
    private String manafacutre;
    private int price;

    public Good() {
        super();
    }

    public Good(String code, String name, String manafacutre, int price) {
        super();
        this.code = code;
        this.name = name;
        this.manafacutre = manafacutre;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManafacutre() {
        return manafacutre;
    }

    public void setManafacutre(String manafacutre) {
        this.manafacutre = manafacutre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", manafacutre='" + manafacutre + '\'' +
                ", price=" + price +
                '}';
    }
}
