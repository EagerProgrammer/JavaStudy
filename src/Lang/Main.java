package Lang;

import org.w3c.dom.stylesheets.StyleSheet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.TooManyListenersException;
//이런 형태로 만들면 Gender Type의 변수에는 Man아니면 Woman만 가능
enum Gender{
Man,Woman
}

public class Main {
    public static void main(String[] args){
        /*String[] nicknames = {"adam", "군계", "일학"};
        //인스턴스 생성
        Data data = new Data(1,"itstudy", nicknames);
        //인스턴스의 참조 복사
        //참조대상이나 원본이 내부데이터를 변경하면 영향을 줍니다.
        Data original = data;
        System.out.println(data);
        //참조를 복사한 경우는 original의 변경이 곧 data의 변경을 가져옵니다.
        original.setNum(2);
        System.out.println(data);


        //name과 nicknames는 배열과 문자열로 직접대입하면 참조가 대입되므로 결국 원본 데이터도 바뀐다.
        //그러므로 Arrays.copy또는 for문을 통해 직접 하나씩 옮겨야한다.
        Data copy = data.clone();
        System.out.println(data);
        copy.setNum(3);
        System.out.println(data);
        copy.setNicknames(nicknames);
        //깊은 복사를 위한 Arrays.copyof 사용
        //nicknames = Arrays.copyOf(this.nicknames, this.nicknames.length);
        data.setNicknames(nicknames);
        Data data1 = new Data(1, "구름", null);
        Data data2 = new Data(1, "구름", null);
        //==는 참조를 비교하는 연산자
        //2개의 인스턴스는 각각 생성자를 호출해서 만들어서 참조가 다름
        //내용이 같은지 확인하고자 할 때는 equals 메서드를 재정의해서 사용
        System.out.println(data1 ==data2);
        System.out.println(data1.equals(data2));*/


        //Wrapper 클래스 사용
        Double d = new Double(13.67);
        d = 17.23;//기본형을 대입하면 new Double(17.23)으로 변환
        //toString이 재정이 되어 있으므로 출력은 참조 가능
        System.out.println(d);
        //기본형을 데이터로 전환
        double x = d;
        System.out.println(x);
        double d1 = 1.60000000000000000;
        double d2 = 0.10000000000000000;
        System.out.println(d1+d2);
        //정확한 산술 연산
        //BigDecimal로 데이터를 만들고 연산을 수행하는 메서드를
        //호출하면 정확한 결과를 만들 수 있음
        BigDecimal b1 = new BigDecimal("1.60000000000000000");
        BigDecimal b2 = new BigDecimal("0.10000000000000000");
        System.out.println(b1.add(b2));
        String str = "Hello";
        System.out.println(System.identityHashCode(str));
        //String은 데이터 수정이 안되기 때문에
        //새로운 공간에 기존의 문자열을 복사한 후 작업을 수행하고 그 참조를 다시 리턴
        //기존의 데이터가 저장된 공간은 메모리 낭비가 될 수 있음
        str += "JAVA";
        System.out.println(System.identityHashCode(str));
        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(System.identityHashCode(stringBuilder));

        stringBuilder.append("Java");
        System.out.println(System.identityHashCode(stringBuilder));
        System.out.println(stringBuilder);
        //여러 데이터를 가지고 하나의 문자열을 생성
        double lat = 12.789;
        double lng = 24.2978;
        //위의 데이터를 가지고 위도 12.789 경도 24.29 문자열로 생성

        String msg = String.format("위도:%.3f 경도:%.3f\n", lat, lng );
        System.out.println(msg);

        String str1 ="안녕하세요";
        try {
            byte[] bytes = str1.getBytes("UTF-8");
            //byte 배열을 문자열로 변환
            String result = new String(bytes, "UTF-8");
            System.out.println(result);
        }catch (UnsupportedEncodingException e){
            throw new RuntimeException(e);
        };


        //운영체제 이름 가져오기
        String os = System.getProperty("os.name");
        //자바 버전 확인
        String version = System.getProperty("java.version");
        System.out.println(os);
        System.out.println(version);

        long start = System.currentTimeMillis();
        for(int i=0; i<1000000000; i=i+1){}
        long end = System.currentTimeMillis();
        System.out.println((end-start + "밀리 초"));

        /*Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        //singleton 패턴으로 디자인되서 해시코드가 동일
        System.out.println(System.identityHashCode(r1));
        System.out.println(System.identityHashCode(r2));
        //프로세스 실행
        try{
           r1.exec("notepad");
        }catch (IOException e){
            e.printStackTrace();
        }
        //기본값 0을 가지고 100000개의 데이터를 가진 배열 생성
        int[] ar = new int[1000000];

        long start1 = System.currentTimeMillis();
        for(int i=0; i <ar.length; i++){
            System.out.println(ar[i]);
        }
        long end1 = System.currentTimeMillis();
        System.out.println((end1-start1)+ "밀리초");*/
        //Generics가 적용된 클래스의 인스턴스를 만들 때는
        //실제 자료형을 결정 지어야 경고가 발생하지 않습니다.
        Generic <String> obj1 = new Generic<>("해글러","오늘 회식","메뉴는","멀까","디비 설계 언제다하지 ","...");

        obj1.disp();
        //기본형은 Generics에 적용할 수 없습니다.
        //Ex) Generic<int> obj2  불가, 그래서 정수형을 쓰고 싶으면 Generic<Interger>로 써야함

        //옵션 사용을 위해서 예전에는 final  상수를 이용
        final int Man = 0;
        final int Woman = 1;

        //int로 만들면 이렇게 정의하지 않은 값을 대입하는게 가능
        int gender = Man;
        gender =3;

        //이런 형태로 만들면 Gender Type의 변수에는 Man아니면 Woman만 가능
        //enum Gender{
            //Man,Woman
        //}
        //Gender가 enum이므로 Gender.Man이나 Gender.Woman만 가능
        Gender t = Gender.Man;

    }}
