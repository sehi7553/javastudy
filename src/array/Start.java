package array;
public class Start {
   public static void main(String[] args) {
       Sort sort = new Sort(); //Sort.java 호출
       int[] arr = {6, 4, 10, 3, 7, 8, 5, 2, 9, 1}; //배열 선언
       sort.sort(arr); //오름차순 정렬 작업 
       sort.array(arr); //출력
   }
}
