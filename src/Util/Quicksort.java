package Util;

import java.util.Arrays;

public class Quicksort {
    //quick sort를 위한 메서드
    //left는 시작 위치, right는 비교의 반대편 끝 위치
    //datark 정렬할 배열
    public static void quickSort(int left, int right, int[] data){
        //데이터 출력
        System.out.println(Arrays.toString(data));

        //기준점 설정 - 설명할 때는 임의이 위치나 중앙이라고 하는데 구현할 때는 맨 왼쪽을 기준으로 설정
        int pivot = left;
        //큰 데이터를 찾기 위한 인덱스
        int i= left+1;
        //작은 데이터를 찾기 위한 인텍스는 right
        //나중에 데이터를 교체하기때문에 pivot 위치를 정장
        int j = pivot;
        //배열의 데이터가 2개 이상인 경우만 수행
        //배열의 데이터가 1개이면 left 와 right가 같아짐
        if(left < right){
            for(; i<= right; i=i+1){
                if(data[i] < data[pivot]){
                    j=j+1;
                    //데이터 교환
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
            //pivot 위치의 데이터를 자신의 위치로 이동
            int temp = data[left];
            data[left] = data[j];
            data[j] = temp;
            //pivot의 위치를 비교가 끝난 자리로 수정
            pivot = j;
            //pivot의 왼쪽 부분을 재귀적으로 다시 quick sort
            quickSort(left, pivot-1, data);
            //pivot의 오른쪽 부분을 재귀적으로 다시 quick sort
            quickSort(pivot+1,right,data);

        }

    }
    public static void main(String[] args){
        int [] ar = {78,87,23,45,98,27,88};
        quickSort(0, ar.length-1, ar);
        System.out.println("오름차순 정렬 후");
        System.out.println(Arrays.toString(ar));
        //이분 검색
        int [] arr = {30,20,50,10,46};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,20));
        //이미 소트 된 상태이므로 30은 2의 인덱스로 나옴
        System.out.println(Arrays.binarySearch(arr,30));
        //마찬가지로 50도 4가나옴
        System.out.println(Arrays.binarySearch(arr,50));

    }
}
