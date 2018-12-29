import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import static java.lang.Thread.sleep;

public class ThreadRunner {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    ThreadRunner(){
        new Thread(() -> {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());

                System.out.println("testowanie wątków : "+ sdf.format(timestamp));
            }
        }).start();
    }
}
