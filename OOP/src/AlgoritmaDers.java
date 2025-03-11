public class AlgoritmaDers {
    int Sinif;
    String Ad, Soyad, Bolum, harfNotu;
    double numara, vizeNotu, finalNotu, ort;

    AlgoritmaDers(double numara, String Ad, String Soyad, int Sinif, String Bolum, double vizeNotu, double finalNotu){
        this.numara = numara;
        this.Sinif = Sinif;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bolum = Bolum;
        this.vizeNotu = vizeNotu;
        this.finalNotu = finalNotu;
    }

    AlgoritmaDers(double numara, String Ad, String Soyad){
        this.numara = numara;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }

    void OrtalamaHesapla(){
        ort = vizeNotu * 0.4 + finalNotu * 0.6;
    }

    void HarfNotuHesapla(){
        if (ort < 50){
            harfNotu = "F";
        } else if (51 <= ort && ort < 60) {
            harfNotu = "D";
        }
        else{
            harfNotu = "A";
        }
    }
}
