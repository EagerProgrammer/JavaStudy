package DataType;

public class FormatDisplay {
    public static void main(String[] args){
        int n =37;
        double d = 23.34145;
        String name = "adam";
        System.out.printf("n:%d\n" , n);

        System.out.printf("n:%10d\n", n);

        System.out.printf("n:%010d\n", n);

        System.out.printf("d:%f\n", d);

        System.out.printf("d:%.4    f\n", d);
    }
}
