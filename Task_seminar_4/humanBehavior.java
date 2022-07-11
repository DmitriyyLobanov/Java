package Task_seminar_4;

import java.util.Random;

public class humanBehavior {
    
    public static boolean humanPatience(){
        Random random = new Random();
        boolean patience = random.nextBoolean();
        return patience;
    }
}
