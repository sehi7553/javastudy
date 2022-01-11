package array;
public class Start {
    public static void sort(int[] arr){
        sort(arr, 0);
    }
    public static void sort(int[] arr, int start){
        if(start < arr.length -1){
            int min_index = start;
            for (int i = start; i < arr.length; i++){
                if(arr[i] < arr[min_index]) min_index = i;
            }
            swap(arr, start, min_index);
            sort(arr, start +1);
        }
    }
    public static void swap (int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
    public static void array(int[] arr){
        for (int data : arr){
            System.out.print(data + ",");
        }
        System.out.println();
    }
   public static void main(String[] args) {
       int[] arr = {6, 4, 10, 3, 7, 8, 5, 2, 9, 1};
       sort(arr);
       array(arr);
   }
}
