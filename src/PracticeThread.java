public class PracticeThread {

  public static void main(String[] args) {
    //        thread1();
    Runnable runA =
        new Runnable() {
          public void run() {
            for (int i = 0; i < 500; i++) {
              System.out.println("A is running");
            }
          }
        };

    Runnable runB =
        new Runnable() {
          public void run() {

            for (int i = 0; i < 200; i++) {
              System.out.println("B is running");
            }
          }
        };
    /* ExecutorService service = Executors.newFixedThreadPool(2);
    service.submit(runA);
    service.submit(runB);
    service.shutdown();*/

    try {
      Thread thread1 = new Thread(runA, "A");
      thread1.start();
      Thread thread2 = new Thread(runB, "B");
      thread2.start();
    } catch (Exception e) {
      System.out.println("Exception caught");
    }

    // comment1
    // commiee 2
    // comm 3

  }
}
