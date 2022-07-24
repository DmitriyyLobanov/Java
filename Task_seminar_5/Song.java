package Task_seminar_5;

import java.util.Random;

public abstract class Song {
    
    public abstract String genre();

    public  int popularity(){
        Random rnd = new Random();
        return rnd.nextInt(0, 10001);
    }

    
}
