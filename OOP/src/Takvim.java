public class Takvim {
    int gun, ay, yil;

    Takvim(){
        this.gun=1;
        this.ay=1;
        this.yil=1000;
    }

    Takvim(int gun, int ay, int yil){
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
    }

    void TakvimIlerlemesi(){
        gun++;
        if (gun == 31){
            gun = 1;
            ay++;
            if (ay == 13) {
                ay = 1;
                yil++;
            }
        }
        System.out.println(gun + "/" + ay + "/" + yil);

    }
}
