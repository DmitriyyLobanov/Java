package Task_01_Seminar_1;
import java.io.IOException;

public class lib {

    public static int FindTriangleNum(int n) throws IOException {
        if (n > 0){
            return (n*(n+1)) / 2;
        }else {
            throw new IOException();
        }
    }

    public static int GetDivisible(int number) {
        
        if (number < 0) return -number * 2;
        if (number <= 9) return number * 2;
        else{
            int count = 0;
            while (number != 0){
                count += number % 10;
                number /= 10;
            }
            return count * 2;
        }
    }
}
