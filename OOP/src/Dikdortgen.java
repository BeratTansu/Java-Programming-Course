public class Dikdortgen {
    int width, height;

    Dikdortgen(){
        this.width = 0;
        this.height = 0;
    }

    Dikdortgen(int width, int height){ //Constructor (Yapılandırıcı)
        this.width = width;
        this.height = height;
    }

    int cevrehesap(){
        return 2*height + 2*width;
    }

    int alanhesap(){
        return height*width;
    }

    //static metotlar class adıyla çağırılabilirken statik olmayanlar modele aittir class adıyla çağırılamaz!!


}
