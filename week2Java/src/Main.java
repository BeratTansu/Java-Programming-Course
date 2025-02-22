import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        herhangi bir n değeri için tek ve çift sayıların toplamı
          Scanner scn = new Scanner(System.in);
//        System.out.println("bir sayı giriniz");
//        int n = scn.nextInt();
//
//        tekcifttoplam(n);


//        girilen iki sayıyı toplayan metot
//        System.out.println("enter first number: ");
//        int a = scn.nextInt();
//        System.out.println("enter second number: ");
//        int b = scn.nextInt();
//
//        sum_number(a,b);


//          birden n e kadar olan sayıların ortalamasını döndüren metot
//          System.out.println("enter a number");
//          int n = scn.nextInt();
//          double ortalama = avg_numbers(n);
//          System.out.println("ortalama= " + ortalama);


//           bir dizinin elemanlarını döndüren metot
//           int[] array = {0,1,2,3,4};
//           dizi_ort(array);


//            bir dizinin elemanlarının ortalamalarını döndüren metot
//            int[] array = {1,3,2,4,5};
//            double dizi_ort = return_dizi_ort(array);
//            System.out.println(dizi_ort);


//            bir dizideki en küçük elemanı döndüren metot
//            int[] array = {5,2,4,3,1};
//            int min_array = min_array(array);
//            System.out.println(min_array);


//             bir dizideki en büyük elemanı döndüren metot
//             int[] array = {1,2,3,4,5};
//             int max_array = max_array(array);
//             System.out.println(max_array);


//              iki vektörün toplamı
//              int[] v1 = {1, 2, 3};
//              int[] v2 = {1, 2, 3};
//
//              int[] toplam = vektorTopla(v1, v2);
//              System.out.println("Toplam Vektör: " + Arrays.toString(toplam));


//              Dot product (skaler çarpım) işlemini yapip sonucu döndüren metot
//              int[] v1 = {1,2,3};
//              int[] v2 = {4,5,6};
//              int[] sonuc = skalerCarpim(v1, v2);
//              System.out.println("Skaler Çarpım: " + Arrays.toString(sonuc));


//              bir matrisin her satırındaki en küçük elemanları bulup döndüren metot
              int[][] matris = {
                      {1, 2, 3},
                      {4, 5, 6},
                      {7, 5}
                  };
              int[] sonuc = satirMinleri(matris);
              System.out.println("Her satırın en küçük elemanları: ");
              for (int i = 0; i < sonuc.length;i++){
                  System.out.println(i+1 + ". satırdaki değeri: " + sonuc[i]);
              }


//              bir matrisin her satırındaki en büyük elemanları bulup döndüren metot
//              int[][] matris = {
//                      {1, 2, 3},
//                      {4, 5, 6},
//                      {7, 8, 9}
//                  };
//              int[] sonuc = satirMaxlari(matris);
//              System.out.println("Her satırın en büyük elemanları: ");
//              for (int max : sonuc){
//                  System.out.println(max + " ");
//              }
    }
    public static void tekcifttoplam(int n){
        int çift = 0;
        int tek = 0;
        for(int i=1;i<=n;i++){
            if (i%2==0){
                çift+=i;
            }
            else{
                tek+=i;
            }
        }

        System.out.println("tek sayıların toplamı: " + tek);
        System.out.println("çift sayıların toplamı: " + çift);
    }

    public static void sum_number(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static double avg_numbers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        double ort = sum/n;
        return ort;
    }

    public static void dizi_ort(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        int ort = sum/ array.length;
        System.out.println(ort);
    }

    public static double return_dizi_ort(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        double ort = sum/ array.length;
        return ort;
    }

    public static int min_array(int[] array){
        int min = array[0];
        for (int i = 1;i< array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public static int max_array(int[] array){
        int max = array[0];
        for (int i = 1;i<array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int[] vektorTopla(int[] v1, int[] v2){
        int[] toplam = new int[0];

        if (v1.length != v2.length) {
            System.out.println("vectors must have the same length");
        }



        for (int i = 0; i < v1.length; i++){
            toplam[i] = v1[i] + v2[i];
        }

        return toplam;
    }

    public static int[] skalerCarpim(int[] v1, int[] v2){
        if (v1.length != v2.length) {
            System.out.println("vectors must have the same length");
        }

        int toplam = 0;
        for (int i = 0; i < v1.length; i++) {
            toplam += v1[i] * v2[i];
        }

        return new int[]{toplam};
    }

    public static int[] satirMinleri(int[][] matris){
        int[] minler = new int[matris.length];

        for (int i = 0; i < matris.length; i++){
            int minDeger = matris[i][0];
            for (int j = 1; j < matris[i].length; j++){
                if (matris[i][j] < minDeger){
                    minDeger = matris[i][j];
                }
            }
            minler[i] = minDeger;
        }
        return minler;
    }

    public static int[] satirMaxlari(int[][] matris){
        int satirsayisi = matris.length;
        int[] maxlar = new int[satirsayisi];

        for (int i = 0; i < satirsayisi; i++){
            int maxDeger = matris[i][0];
            for (int j = 1; j < matris[i].length; j++){
                if (matris[i][j] > maxDeger){
                    maxDeger = matris[i][j];
                }
            }
            maxlar[i] = maxDeger;
        }
        return maxlar;
    }
}