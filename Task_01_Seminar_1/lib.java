package Task_01_Seminar_1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class lib {

    public static int FindTriangleNum(int n) throws IOException {
        if (n > 0){
            return (n*(n+1)) / 2;
        }else {
            throw new IOException();
        }
    }

    public static int GetDivisible(int min, int max) {
        
        int result = 0;
        List<Integer> numList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            
            int currentNum = i;
            int count = 0;

            while (currentNum > 0) {

                count += currentNum % 10;
                currentNum /= 10;
            }
            if (i % count == 0){
                numList.add(i);
            }
        }
        result = Collections.max(numList);
        //System.out.println(numList);
        return result;
    }
    

}

