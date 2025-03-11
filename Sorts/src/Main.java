public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};

        InsertionSort.insertionSort(arr);

        System.out.print("Insertion Sort ile Sıralanmış dizi: ");
        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        BubbleSort.bubbleSort(arr);
        System.out.print("Bubble Sort ile Sıralanmış dizi: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        //verimliliklerini öğren
        //hangi durumlarda verimliliklerinin düştüğünü öğren

    }
}
