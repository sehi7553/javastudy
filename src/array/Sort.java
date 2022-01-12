package array;

public class Sort {
    public void sort(int[] arr){
        sort(arr, 0);//재귀함수 호출 0 <-start 위치 선언
    }
    public void sort(int[] arr, int start){
        if(start < arr.length -1){ //시작점이 배열의 마지막 방 보다 작을 경우
            int min_index = start; //min_index에 시작 인덱스 0을 담음
            for (int i = start; i < arr.length; i++){ //시작점 숫자보다 작을때 까지 반복
                if(arr[i] < arr[min_index]) min_index = i; //min_index안에 값이 i값보다 크면 min_index값에 i값 담음 
            }
            swap(arr, start, min_index);//start 숫자와 min_index숫자 위치 바꿔주는 함수.
            sort(arr, start +1);//맨앞 숫자는 정렬이 끝났으므로 시작점에서 +1 해서 다시 선언
        }
    }
    public void swap (int[] arr, int index1, int index2){
        int tmp = arr[index1]; //start값을 tmp에 대입
        arr[index1] = arr[index2];//min_index값을 start에 대입
        arr[index2] = tmp;//tmp값을 min_index에 대입
        //
    }
    public void array(int[] arr){
        for (int data : arr){ //(변수명 : 배열명)
            System.out.print(data + " "); //출력
        }
    }
}
