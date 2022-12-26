package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ConnectionAccess {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
       list.add("java");
       list.add("java web programming");
       list.add("Spring Framework");

       int len = list.size();
       //반복문 이용
       for(int i=0; i < len; i++){
           System.out.print(list.get(i)+"\t");
       }
       System.out.println();
       //빠른 열거
        for(String s : list){
           System.out.println(s);
       }
       //이터레이터 이용
        Iterator<String> iterator = list.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next()+"\t");
       }
       System.out.println();
       //스트림 API 활용, 내부 반복자를 이용하기 때문에 가장 빠름
        Stream<String> stream = list.stream();
        stream.forEach(temp -> System.out.print(temp+"\t"));

    }
}
