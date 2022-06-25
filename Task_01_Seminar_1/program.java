package Task_01_Seminar_1;

import java.io.IOException;

public class program {
    public static void main(String[] args) {
       
        // Задача о поиске n-ого треугольного числа.
        try {
            System.out.println(lib.FindTriangleNum(3));
        }catch (IOException ex){
            ex.printStackTrace();
        }

        // Задача о вычислении числа, без остатка делящегося на сумму цифр заданного числа.
        System.out.println(lib.GetDivisible(365));
        
    }
    
}
