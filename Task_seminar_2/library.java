package Task_seminar_2;
import java.util.*;

public class library {
    
    //бинарный поиск
    public static int binarySearch(int[] inputArray, int item)  {
        
        int left = 0;
        int right = inputArray.length - 1;
        int middle = 0;
        int posicion = -1;
        while (left <= right){
            middle = (left + right) / 2;
            if (inputArray[middle] == item){
                posicion = middle;
                break;
            }
            if (inputArray[middle] > item){
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return posicion;
    }

    // Создание массива, заполненного случайными int значениями.
    public static int[] createArray(int arrayLength, int upperRandValue) {
        int[] resultArray = new int[arrayLength];
        Random rand = new Random();
        int randint = rand.nextInt(upperRandValue + 1);
        for (int i = 0; i < resultArray.length; i++) {
            randint = rand.nextInt(upperRandValue + 1);
            resultArray[i] = randint;
        }

        return resultArray;
    }

    // Метод эмулирующий работу динамического массива.
    public static int[] arrayAppend(int[] array, int itemToAppend ) {
        int newSize = array.length + 1;
        int[] resultArray = new int[newSize];
        for (int i = 0; i < resultArray.length; i++) {
            if(i == resultArray.length - 1){
                resultArray[i] = itemToAppend;
            }else{
                resultArray[i] = array[i];
            }
            
        }
        return resultArray;
    }

    // Mетод восстанавливающий выражение из формы 2? + ?5 = 69
    public static String restoringExpression(String expression) {

        String[] parseStr = expression.split(" ");
        String first = parseStr[0];
        String second = parseStr[2];
        String sum = parseStr[4];
        String x = "";
        String y ="";
        String result = "";
        for (int i = 0; i < 10 ; i++) {
            x = first.replace("?", Integer.toString(i));
            for (int j = 0; j < 10; j++) {
                
                y = second.replace("?", Integer.toString(j));
                if (checkSum(x, y, sum) == true){
                    return result + x + " + " + y + " = " + sum;
                }
                y = "";
                }
            x = "";
            }
            return "Решения не существует!";
        }
        
        
    // Метод созданный для проверки выражения поступающего из метода restoringExpression, и проверяющий истинность выражения.
    public static boolean checkSum(String x, String y, String sumXY) {
        int first = Integer.parseInt(x);
        int second = Integer.parseInt(y);
        int sum = Integer.parseInt(sumXY);
        if (first + second == sum){
            return true;
        }else{
            return false;
        }

    }
}





