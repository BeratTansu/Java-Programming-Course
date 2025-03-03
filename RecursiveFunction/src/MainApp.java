import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //1den n'e kadar sayıları yazdıran recursive örnek
        int sayi = 10;
        OtherExamples ot = new OtherExamples();
        ot.printNumbers(sayi);
        System.out.println();// satır atlasın diye yazdım

        ////sayının basamak toplamını hesaplama => 1234 = 1 + 2 + 3 + 4 = 10
        int number = 1234;
        System.out.println(OtherExamples.sumOfDigits(number));

        //sayıyı ters çevirme 1234 => 4321
        System.out.println(OtherExamples.reverse(number,0));

        //N'den 1'e kadar yazdırma
        ot.printNumbersReverse(sayi);

        System.out.println();

        //Diziyi ters yazdırma
        int[] array = {1, 2, 3, 4, 5};
        ot.printArrayReverse(array, array.length - 1);

        System.out.println();

        // Dizideki elemanların toplamı
        System.out.println(OtherExamples.sumArray(array,array.length - 1));




        //1.recursive ödevi
//        System.out.println("2.recursive örneği için sayı gir");
//        int sayi = scn.nextInt();
//        for (int i = 1; i <= sayi; i++) {
//            System.out.println("a(" + i + ") = " + Homework.recursiveSeries1(i));
//        }


        //2.recursive ödevi
//        System.out.println("2.recursive örneği için sayı gir");
//        int sayi2 = scn.nextInt();
//        for (int i = 1; i <= sayi2;i++){
//            System.out.println("a(" + i + ") = " + Homework.recursiveSeries2(i));
//        }

        //recursive fonksiyonun gerçek hayattaki örneklerini araştır

//        int[] a = {5,4,2,8,7};
//        int min = OtherExamples.findMin(a,0);
//        System.out.println(min);
//
//        int number = scn.nextInt();
//        System.out.println(OtherExamples.evensSum(number));
//
//        System.out.println("tabanı girin: ");
//        int taban = scn.nextInt();
//        System.out.println("üssü girin: ");
//        int us = scn.nextInt();
//        System.out.println(OtherExamples.powerBy(taban,us));
//
//        int sayi = scn.nextInt();
//        System.out.println(OtherExamples.sayi_dondurme(sayi));


        /*
        int sayi2 = scn.nextInt();
        System.out.println(OtherExamples.sum(sayi2));


        System.out.println("enter a number for factoriel: ");
        int number = scn.nextInt();

        System.out.println(number + "! = " + Factoriel.factoriel(number));

        System.out.println("enter a number for fibonacci: ");
        int number2 = scn.nextInt();
        System.out.println(Fibonacci.fibonacci(number2));
        */

    }
}
