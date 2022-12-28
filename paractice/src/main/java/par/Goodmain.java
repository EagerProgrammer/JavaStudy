package par;

public class Goodmain {
    public static void main(String[] args){
        GoodDAO dao1 = GoodDAOImpl.getInstance();
        //System.out.println(dao1.getAll());
        //GoodDAO dao2 = GoodDAOImpl.getInstance();

        //System.out.println(System.identityHashCode(dao1));
        //System.out.println(System.identityHashCode(dao2));
        //System.out.println(dao1.getGood("1"));
        //System.out.println(dao1.getGood("20"));
        Good good = new Good();
        good.setCode("10");
        good.setName("과자");
        good.setManafacutre("부산");
        good.setPrice(50);
        int r = dao1.insertGood(good);
        if(r == 1){
            System.out.println("삽입 성공");}
            else{
                System.out.println("삽입 실패");
            }
        }

    }

