package Part4_1.Question15;

public class Statistic {
    private int count;
    private int sum;

    public Statistic(){
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number){
        this.count++;
        this.sum += number;
    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        return this.sum / this.count;
    }


}
