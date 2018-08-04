import java.util.concurrent.CompletableFuture;

public class PracticeAwait {
    public static void main(String[] args) throws InterruptedException {


        Runnable runA = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("A is running");
                }

            }

        };

        Runnable runB = new Runnable() {
            public void run() {

                for (int j = 0; j < 10; j++) {
                    System.out.println("B is running");
                }


            }

        };
        CompletableFuture.runAsync(runA);
        CompletableFuture.runAsync(runB);
        Thread.sleep(100);
    }

}
