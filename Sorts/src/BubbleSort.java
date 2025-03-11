public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

//quick ve merge mantığı öğrenilecek
//1. metot 2.recursive 3.oop 4.sorts 5 bilgiler
