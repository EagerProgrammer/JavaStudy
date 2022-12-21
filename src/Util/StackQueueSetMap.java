package Util;

import java.util.*;

public class StackQueueSetMap {

    public static void main(String[] args){
        java.util.Stack <String> stack= new java.util.Stack<String>();
        //스택에 데이터 추가
        stack.push("마리오 캠페스");
        stack.push("디에고");
        stack.push("가브리엘");
        stack.push("메시");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        //데이터를 sort된 것 처럼 저장
        Queue <String> queue = new PriorityQueue<>();
        queue.offer("요한");
        queue.offer("페이커");
        queue.offer("김범수");
        queue.offer("창업");
        queue.offer("성공");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        //저장 순서를 알 수 없는 set인스턴스 생성
        Set <String> set = new HashSet<>();
        set.add("집에");
        set.add("갈래");
        set.add("안뇽");
        set.add("자이언티");
        set.add("눈");
        //동일한 데이터를 삽입 - equals 메서드로 비교해서
        //true이면 삽입하지 않습니다.
        //Set은 데이터 삽입에 실패하면 false를 리턴하고
        //성공하면 ture를 리턴합니다.
        set.add("집에");
        System.out.println(set);

        //로또 번호 생성기 처럼
        //1~45까지의 숫자 6개를 입력 받아서 저장한 후 출력
        //입력을 받을 때 1~45 사이의 숫자가 아니면 다시 입력하도록
        //중복되는 숫자를 입력하면 다시 입력하도록 합니다.
        //데이터를 출력할 때는 정렬을 해서 출력
        //숫자 6개를 저장할 공간을 생성
        //중복 검사가 수월하고 정렬을 수행하면서 삽입하는 TreeSet을 이용(이처럼 자료구조 선택은 매우 중요함)
        /*
        //배열을 이용하는 경우
        //입력받기 위한 인스턴스 생성
        Scanner scanner = new Scanner(System.in);
        //6개의 정수를 받을 배열
        int[] lotto = new int[6];

        int len = lotto.length;
        for(int i=0; i< len; i++){
            try {
                System.out.print("로또 번호 입력 :");
                lotto[i] = scanner.nextInt();
                //1부터 45사이의 숫자만 입력받도록 하기
                if(lotto[i] <1 || lotto[i] >45){
                    System.out.println("1~45 숫자만 입력하세요");
                    i--;
                    continue;
                }
                //데이터 중복검사
                //첫번째 부터 현재데이터 앞까지 비교

                //중복이 발생했는지 체크하기 위한 변수
                boolean flag = false;
                int j =0;
                for(;  j<i; j++){
                    //두 개 데이터가 같음
                    if(lotto[i]==lotto[j]){
                        //중복되었다고 표시
                        flag = true;
                        break;
                    }
                }
                //중복된 경우
                if(flag == true){
                    System.out.println("중복된 숫자입니다.");
                    i--;
                }
            }catch (Exception e){
                //이번은 무효  - 인덱스를 뒤로
                i--;
                scanner.nextLine();
                System.out.println("숫자를 넣으세요!!!");
            }
        }
        //배열의 데이터 정렬
        Arrays.sort(lotto);
        //배열의 데이터 출력
        System.out.println(Arrays.toString(lotto));
        //스캐너 정리
        scanner.close();
        */


        //Set을 이용해 구현
        /*Scanner sc = new Scanner(System.in);

        //중복된 데이터를 저장하지 않고 데이터를 정렬해서 저장하는
        //자료구조 클래스
        Set <Integer> set2 = new TreeSet<>();
        while (set2.size() <6){
            System.out.print("로또번호 입력:");
            int temp = sc.nextInt();
            if(temp <1 || temp >45){
                System.out.println("1부터 45사이로 입력");
                continue;
            }
            //중복검사
            boolean result = set2.add(temp);
            //삽입에 실패하면 - 중복된 데이터라면
            if(result ==false){
                System.out.println("중복된 숫자를 입력하면 안됩니다");
            }
        }
        System.out.println(set2);

        //배열로 사용 안됨 단순 형변환으로는 배열로 못바꿈 Stream을 활용해 나중에 바꿀 수 있습니다.
        //Integer [] lotto = (Integer[])set2.toArray();
        //System.out.println(Arrays.toString(lotto));

        //스캐너 종료
        sc.close();
         */

        //Map의 활용
        //데이터의 종류가 1가지라면 Object 대신에 그 자료형을 기재해도 됩니다.
        Map<String, Object> map = new HashMap<>();

        //데이터 추가
        map.put("name","adam");
        //데이터 가져오기
        System.out.println(map.get("name"));
        //중복된 키를 이용한 데이터 삽입
        map.put("name", "카리나");
        System.out.println(map.get("name"));
        //없는 키를 가져왔을때 자바는 null
        System.out.println(map.get("num"));
        //Value를 Object로 설정햇을 때 사용
        //Value를 삽입할때 String이지만
        //Map을 만들때 Value type을 Objcet로 설정했기 때문에 get을 해서 데이터를 원상 복구하고자 하면 강제 형변환을 해야합니다.
        String value = (String) map.get("name");
        //모든 키를 가져오는 것
        Set <String> keys = map.keySet();
        System.out.println(keys);

    }
}
