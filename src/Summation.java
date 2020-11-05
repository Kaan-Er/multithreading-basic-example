public class Summation extends Thread{
    private int[] upper;
    public static int totalSum;

    public Summation(int[] upper){
        this.upper = upper;
        totalSum = 0;
    }

    @Override
    public void run(){

        for(int i = 0; i < upper.length; i++)
            totalSum += upper[i];
    }
}