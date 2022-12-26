package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReductioOperator {
    public static void main(String[] args){
        List<String> list = Arrays.asList("홍범도","이순신","안중근","안창호","남자현","윤봉길","홍범도");
        //스트림 생성
        Stream<String> stream = list.stream();
        //stream.forEach((temp)->System.out.println(temp));

        //2개 빼고 출력
        //stream.skip(2).limit(3).forEach((temp)->System.out.println(temp));
        //중복제거
        //stream.distinct().forEach((temp)->System.out.println(temp));
        //필터링
        //매개변수가 1개이고 Boolean을 리턴하는 함수를 대입
        //stream.filter(name -> name.charAt(0) == '안').forEach((temp)->System.out.println(temp));}}
        //ㅇ으로 시작하는
        stream.filter(
                name-> name.charAt(0) >= '아' && name.charAt(0) <='자').sorted().forEach((temp) -> System.out.print(temp + "\t"));

    }}