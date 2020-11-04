import java.util.Random;

public class Summation extends Thread{
    private int upper;
    public static int total;

    public Summation(int upper) {
        this.upper = upper;
        total = 0;
    }

    @Override
    public void run() {
        Random rnd = new Random();
        for(int i=0;i <upper; i++)
        {
            total += rnd.nextInt(10000);
        }
    }
}
