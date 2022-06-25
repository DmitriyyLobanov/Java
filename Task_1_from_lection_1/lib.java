package Task_1_from_lection_1;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class lib {
    public static int getInputDegree() {
        Scanner inpScanner = new Scanner(System.in);
        int degree = inpScanner.nextInt();
        inpScanner.close();
        return degree;
    }

    public static String createPolynome(int maxDegree){
        int randCoef = ThreadLocalRandom.current().nextInt(0, 101);
        String res = "";
        while (maxDegree != 0){
            randCoef = ThreadLocalRandom.current().nextInt(0, 101);
            res += Integer.toString(randCoef) + "x^" + Integer.toString(maxDegree) + " + ";
            maxDegree--;
        }
        res += Integer.toString(randCoef) + " = 0";
        //String res = Integer.toString(randCoef);
        return res;
    }

    public static void writeFile(String arg, String fileName){
        String dir = "C:\\Users\\Zver\\Desktop\\GeekBrains\\java\\Task_1_from_lection_1\\"; //System.getProperty("user.dir");
        String path = String.format("%s%s", dir, fileName); //dir.concat(fileName); 
        try (FileWriter fr = new FileWriter(path, false)) {
            fr.write(arg);
            fr.close();
        }
        catch (IOException ex) {
            ex.printStackTrace(); //System.out.println(ex.getMessage());
        }
    }

//public static String sumPolynoms(String firstPoly, String secondPoly) {
//
//    return
//}

    public static void parsePolynom(String poly) {
        //String[] polyArr = poly.split(" ");
        ArrayList<String> polyList = new ArrayList<String>(Arrays.asList(poly.split(" ")));
        //System.out.println(Arrays.toString(polyArr));

        System.out.println(polyList);
    }
        
        
        
        
    
}
