package encryptdecrypt;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class SomeShortCheckings {
    public static void main(String[] args) throws Exception{
//        long wholeMemory = Runtime.getRuntime().maxMemory();
        List<String> lst = new ArrayList<String>();
        lst.add("JOPA");
        System.out.println(lst.get(-1));
        lst.size();
//        long memInMB = (wholeMemory/(1024*1024));
//        long freeMemory = Runtime.getRuntime().freeMemory();
//        int percentOfFreeMemory =(int) (freeMemory*100/wholeMemory);
//        System.out.printf("we have %d %% of free memory\n whole memory is %dMB",percentOfFreeMemory,memInMB);
        ExecutorService executor = Executors.newWorkStealingPool();

        for (int i = 1; i <= 2; i++) {
            int taskNumber = i;
            executor.submit(() -> System.out.println("Starting task-" + taskNumber));
        }

        MILLISECONDS.sleep(50); // the current thread waits for 50 millis

        executor.shutdown();

        System.out.println("Main completed");
    }
}
