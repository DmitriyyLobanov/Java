package Task_seminar_4;

import java.util.Random;

public class WorkWindow {
    
    public static long closedWindow() {
        System.out.println("Окно закрыто, перерыв n-минут.");
        return 3000 ;
    }

    public static boolean probabilityOfClosure() {
        Random random = new Random();
        int base = random.nextInt(0, 101);
        if (base > 25){
            return false;
        }else{
            return true;
        }
    }

}
