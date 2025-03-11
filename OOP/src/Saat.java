public class Saat {
    int saniye, dakika, saat;

    Saat(){
        this.saat=0;
        this.dakika=0;
        this.saniye=0;
    }

    Saat(int saat, int dakika, int saniye){
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }

    void SaatIlerlemesi(){
        saniye++;
        if (saniye == 60){
            saniye = 0;
            dakika++;
            if (dakika == 60) {
                dakika = 0;
                saat++;
                if (saat == 24){
                    saat = 0;
                }
            }
        }
        System.out.println(saat + "." + dakika + "." + saniye);

    }
}
