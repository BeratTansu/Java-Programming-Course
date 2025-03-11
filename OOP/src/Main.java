public class Main {
//    public static void main(String[] args) throws InterruptedException{
//        /**Bir oop modeli (class) oluşturmak için gerekenler;
//          1. Modele ait betimleyici değişkenlerin tanımlanması,
//          2. Değişkenleri hazırlayan yapılandırıcı (constructor) metotların tanımlanması,
//          3. Değişkenlere ilişkin işlemleeri gerçekleştiren metotların tanımlanması.
//         **/
//
//        Dikdortgen d1 = new Dikdortgen(100, 50); //Dikdörtgen tipinde bir d1 nesnesi (object) oluşturduk
//
//        System.out.println("d1 dikdörtgeninin yüksekliği= " + d1.height);
//        System.out.println("d1 dikdörtgeninin genişliği= " + d1.width);
//
//        int cevre1 = d1.cevrehesap();
//        int alan1 = d1.alanhesap();
//
//        System.out.println("d1 dikdörtgeninin çevresi= " + cevre1);
//        System.out.println("d1 dikdörtgeninin alanı= " + alan1);
//
//
//        Ucgen u1 = new Ucgen();
//        int ucgenAlan = u1.ucgenalan();
//        u1.height = 10;
//        u1.base = 5;
//
//        System.out.println("u1 üçgeninin yüksekliği= " + u1.height);
//        System.out.println("u1 üçgeninin tabanı= " + u1.base);
//
//        System.out.println("u1 üçgeninin alanı= " + u1.ucgenalan());
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//
//        //***************************************AlgoritmaDersi*****************************************
//
//        AlgoritmaDers ogrenci1 = new AlgoritmaDers(64, "Berat Tansu", "Çabuk", 2, "Yazılım Mühendisliği", 50, 60);
//        System.out.println("Öğrenci Adı: " + ogrenci1.Ad);
//        System.out.println("Öğrenci Soyadı: " + ogrenci1.Soyad);
//        System.out.println("Öğrencinin numarası: " + ogrenci1.numara);
//
//        ogrenci1.OrtalamaHesapla();
//        ogrenci1.HarfNotuHesapla();
//        System.out.println(ogrenci1.Ad + " adlı öğrencinin not ortalaması: " + ogrenci1.ort);
//        System.out.println(ogrenci1.Ad + " adlı öğrencinin harf notu: " + ogrenci1.harfNotu);
//
//
//        AlgoritmaDers ogrenci2 = new AlgoritmaDers(32, "beratti", "forma");
//        System.out.println("Öğrenci Adı: " + ogrenci2.Ad);
//        System.out.println("Öğrenci Soyadı: " + ogrenci2.Soyad);
//        System.out.println("Öğrencinin numarası: " + ogrenci2.numara);
//
//        ogrenci2.Sinif = 2;
//        ogrenci2.Bolum = "Yazılım Mühendisliği";
//        ogrenci2.vizeNotu = 40;
//        ogrenci2.finalNotu = 10;
//
//        ogrenci2.OrtalamaHesapla();
//        ogrenci2.HarfNotuHesapla();
//        System.out.println(ogrenci2.Ad + " adlı öğrencinin not ortalaması: " + ogrenci2.ort);
//        System.out.println(ogrenci2.Ad + " adlı öğrencinin harf notu: " + ogrenci2.harfNotu);
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//
//
//        //*******************************Dijital Saat***********************************************
//
//        Saat dijitalSaat = new Saat(12,24,13);
//        System.out.println(dijitalSaat.saat + "." + dijitalSaat.dakika + "." + dijitalSaat.saniye);
//        dijitalSaat.SaatIlerlemesi();
//        System.out.println(dijitalSaat.saat + "." + dijitalSaat.dakika + "." + dijitalSaat.saniye);
//        while(true){
//            dijitalSaat.SaatIlerlemesi();
//            Thread.sleep(1000); //1000 millisecond = 1 second
//        }
//
//
//        //*******************************Takvim***********************************************
//        Takvim calender = new Takvim();
//
//        System.out.println(calender.gun + "/" + calender.ay + "/" + calender.yil);
//        calender.TakvimIlerlemesi();
//        System.out.println(calender.gun + "/" + calender.ay + "/" + calender.yil);
//        while(true){
//            calender.TakvimIlerlemesi();
//            Thread.sleep(1000); //1000 millisecond = 1 second
//        }
//    }

}
