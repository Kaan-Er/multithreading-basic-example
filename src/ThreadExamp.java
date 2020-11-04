public class ThreadExamp implements Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExamp());
        t1.start();
    }

    @Override
    public void run() {
        try {
            int upper = 1000;
            Thread[] threads = new Thread[10];
            for (int i=0; i<10; i++)
            {
                threads[i] = new Summation(upper);
                threads[i].start();
            }
            System.out.println("Total : " + Summation.total);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
