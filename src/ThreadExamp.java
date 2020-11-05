import java.util.Random;

public class ThreadExamp implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadExamp());
        thread.start();
    }

    @Override
    public void run() {
        try {
            int[] rndItem = new int[10000];
            int[] rndItemTemporary = new int[1000];
            Random random = new Random();

            for(int i = 0; i < 10000; i++){
                rndItem[i] = random.nextInt(10000);
            }

            int k = 0;
            Thread[] threads = new Thread[10];

            for(int i = 0; i < threads.length; i++){

                for(int j = k; j < k+1000; j++){
                    if(j > 999)
                        rndItemTemporary[j-k] = rndItem[j];
                }
                k += 1000;
                threads[i] = new Summation(rndItemTemporary);
                threads[i].start();
            }
            System.out.println("Total : " + Summation.totalSum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
