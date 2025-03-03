public class Homework {
    //3, 15, 75, 375, ... diye devam eden seriyi recursive fonksiyon ile ifade ediniz
    public static int recursiveSeries1(int n){
        if (n == 1){ // base Case: ilk terim 3
            return 3;
        }

        //recursive Case: a(n) = a(n - 1) * 5
        return recursiveSeries1(n-1) * 5;
    }


    //3, 6, 12, 24, 48, 96... diye devam eden seriyi recursive fonksiyon ile ifade ediniz
    public static int recursiveSeries2(int n){
        if (n == 1){ // Base Case: ilk terim 3
            return 3;
        }

        //recursive Case: a(n) = a(n - 1) * 2
        return recursiveSeries2(n-1) * 2;
    }
}
