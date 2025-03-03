public class OtherExamples {
    //1den n'e kadar sayı yazdırma
    public void printNumbers(int n){
        if (n == 0){ //Base Case
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    //sayının basamak toplamını hesaplama => 1234 = 1 + 2 + 3 + 4 = 10
    public static int sumOfDigits(int n){
        if (n == 0){ // Base Case
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    //sayıyı ters çevirme 1234 => 4321
    public static int reverse(int n, int rev){
        if (n == 0){ // Base Case
            return rev;
        }
        // Recursive Case
        return reverse(n / 10, rev * 10 + (n % 10));
    }

    //N'den 1'e kadar yazdırma
    public void printNumbersReverse(int n){
        if (n == 0){ // Base Case
            return;
        }
        // Reverse Case
        System.out.print(n + " ");
        printNumbersReverse(n - 1);
    }

    //diziyi ters yazdırma
    public void printArrayReverse(int[] array, int index){
        if (index < 0){ // Base Case
            return;
        }
        // Reverse Case
        System.out.print(array[index] + " ");
        printArrayReverse(array, index-1);
    }

    // Dizideki elemanların toplamı
    public static int sumArray(int[] array, int index){
        if (index < 0){ // Base Case
            return 0;
        }
        // Reverse Case
        return array[index] + sumArray(array, index - 1);
    }
    public static int sayi_dondurme(int n){
        if(n == 1){
            System.out.print(n + " ");
            return n;
        }
        System.out.print(n + " ");
        return sayi_dondurme(n - 1);
    }
    public static int sum(int n){
        //base case
        if (n == 0){
            return n;
        }
        return n + sum(n - 1);
    }
    public static int powerBy(int x, int y){
        if (y == 0){
            return 1;
        }
        return x * powerBy(x, y-1);
    }
    public static int evensSum(int n){
        if (n < 2){
            return 0;
        } else if (n % 2 == 0) {
            return evensSum(n - 1);
        }
        return n + evensSum(n - 1);
    }
    public static int findMin(int[] array, int index){
        //Base Case
        if (index == array.length-1){
            return array[index];
        }
        //recursive case
        int minrest = findMin(array,index+1);

        if (array[index] < minrest){
            return array[index];
        }else {
            return minrest;
        }
    }
}
