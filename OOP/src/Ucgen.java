public class Ucgen {
    int height;
    int base;

    Ucgen(){
        this.height = 0;
        this.base = 0;
    }

    Ucgen(int height, int base){
        this.height = height;
        this.base = base;
    }

    int ucgenalan(){
        return (base*height)/2;
    }
}
