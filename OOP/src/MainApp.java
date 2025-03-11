public class MainApp {
    public static void main(String[] args) throws InterruptedException{
        Takvim calender = new Takvim();

        System.out.println(calender.gun + "/" + calender.ay + "/" + calender.yil);
        calender.TakvimIlerlemesi();
        System.out.println(calender.gun + "/" + calender.ay + "/" + calender.yil);
        while(true){
            calender.TakvimIlerlemesi();
            Thread.sleep(1000); //1000 millisecond = 1 second
        }
    }
}
