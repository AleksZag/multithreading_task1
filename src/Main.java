import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ThreadGroup mainGroup = new ThreadGroup("main group");

        for(int i=0; i<4; i++){
            new MyThread(mainGroup, "поток № " + (i+1)).start();
      }
        Thread.sleep(15000);

        mainGroup.interrupt();




    }


}
