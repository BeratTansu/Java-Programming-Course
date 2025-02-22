import javax.xml.transform.Result;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayApp {

    //1D diziyi ekrana yazdıran metod
    public static int[] array1D_print(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.println((i+1) + ". eleman: " + array[i]);
        }
        return array;
    }

    //diziye 1 ile 50 arasında random değerler veren metod
    public static void add_vals_array1D(int[] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = r.nextInt(51);
        }
    }

    //kullanıcıdan eleman alıp diziye ekleyen metod
    public static int[] value_with_scanner(){
        Scanner scn = new Scanner(System.in);
        System.out.println("kaç elemanlı bir dizi istiyorsunuz: ");
        int boyut = scn.nextInt();

        int[] array = new int[boyut];

        for (int i = 0; i < boyut; i++){
            System.out.println("dizinin " + (i+1) + ". elemanını giriniz: ");
            array[i] = scn.nextInt();
        }

        return array;
        //multiply ? nedir. method overloading araştır!
        //System.out.println metodu, method overloading sayesinde hem int, hem String hem de diğer değişkenleri aynı anda kullanabiliyoruz.
    }

    //Dizideki en küçük elemanı bulan metod
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //Dizinin ortalamasını alan metod
    public static int dizi_ort(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        int ort = sum/ array.length;
        System.out.println("Dizinin ortalaması: " + ort);
        return ort;
    }

    //Dizideki en büyük elemanı bulan metod
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //Diziyi ters çeviren metod
    public static int[] reverseArray(int[] array){
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[array.length - 1 - i];
            System.out.println((i+1) + ".eleman= " + reversedArray[i]);
        }
        return reversedArray;
    }

    //Dizideki tek ve çift sayıları ayıran metod
    public static int[][] separateOddEven(int[] array){
        int[] evenNumbers = new int[array.length];
        int[] oddNumbers = new int[array.length];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenNumbers[evenIndex++] = array[i];
            }
            else {
                oddNumbers[oddIndex++] = array[i];
            }
        }

        evenNumbers = Arrays.copyOf(evenNumbers, evenIndex); //diğer elemanları sıfır olarak yazar. Eğer dizi 1 2 3 4 ise çift sayıların çıktısı = [2, 4, 0, 0] olur. Bu sıfırları silmek için copyOf kullanırız.
        oddNumbers = Arrays.copyOf(oddNumbers,oddIndex);

        return new int[][]{evenNumbers,oddNumbers};
    }


}
