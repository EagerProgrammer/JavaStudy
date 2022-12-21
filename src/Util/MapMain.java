package Util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class VO{
    private int number;
    private String name;

    public VO() {
        super();
    }

    public VO(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VO{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
public class MapMain {
    public static void main(String[] args){
        //데이터 생성 - 모델
        //VO vo= new VO(1,"adam");
        //데이터 출력 - View
        //모델의 근원이 되는 VO클래스 안에 속성 이름을 변경하면 View도 수정 되어야합니다.
        //관계형 데이터 베이스는 VO 클래스를 활용
        //System.out.println(vo.getName());
        //System.out.println(vo.getNumber());


        //VO의 클래스의 인스턴스 역할을 하는 Map을 생성
        Map <String, Object> map = new HashMap<>();
        map.put("번호" ,1);
        map.put("이름","adam");
        //map의 모든 키를 가져와서 출력
        Set <String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + ":" + map.get(key));
        }

        //배열의 배열 - 2차원 배열 : Matrix - 태그가 없음
        String[] doro = {"유나","정아","정원"};
        String[] lg = {"혜진","서연"};
        String[] ginseog = {"엄크","아크"};
        //이차원 배열 생성
        //팀이 추가되면 태그를 수정해야함
        String [][] volley = {doro, lg, ginseog};
        int i = 0;
        for(String[] temp:volley){
            if(i==0){
                System.out.print("도로공사 :");
            }else {
                System.out.print("LG:");
            }
            i++;
            for(String imsi : temp){
                System.out.print(imsi);
            }
            System.out.println();

            //이차원 배열 대신에 Map의 배열 - Table
            Map <String, Object> map1 = new HashMap<>();
            map1.put("name","도로공사");
            map1.put("team", doro);
            Map <String, Object> map2 = new HashMap<>();
            map2.put("name","Lg");
            map2.put("team", lg);
            Map <String, Object> map3 = new HashMap<>();
            map3.put("name","ginsong");
            map3.put("team", ginseog);

            Map [] v = {map1,map2,map3};
            for(Map te : v){
                System.out.print(te.get("name")+"\t");
                String[] temp1 = (String[]) te.get("team");
                for(String im : temp1){
                    System.out.print(im + "\t");
                }
                System.out.println();
            }
         }

    }}
