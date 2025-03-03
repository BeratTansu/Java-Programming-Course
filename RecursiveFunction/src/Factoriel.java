public class Factoriel {
    public static long factoriel(int n){
        if (n <= 1){
            return 1;
        }
        return n * factoriel(n-1);
    }
}
