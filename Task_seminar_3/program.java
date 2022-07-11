package Task_seminar_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class program {
    public static void main(String[] args) {

        //Реализация добавления разных телефонных номеров для повторяющейся фамилии
        Map<String, ArrayList<String>> dataMap = new HashMap<>();

        lib.addValues(dataMap, "Иванов", "12345");
        lib.addValues(dataMap, "Джавушкин", "896321477");
        lib.addValues(dataMap, "Петров", "56789");
        lib.addValues(dataMap, "Петров", "452383");
        lib.addValues(dataMap, "Сидоров", "98765");
        lib.addValues(dataMap, "Сидоров", "52647");
        lib.addValues(dataMap, "Сидоров", "456783");
        
        //Задача №1
        //Вывод в консоль всех номеров для каждой фамилии
        for (Map.Entry<String, ArrayList<String>> buf : dataMap.entrySet()) {
            System.out.println(buf.getKey());
            System.out.println(buf.getValue());
        }

        //Задача №2
        //Подгрузка для наглядности валидных пароля и логина из файла validData.java 
        //И последующий вызов метода - аутентификатора. 
        System.out.println(validData.validLogin);
        System.out.println(validData.validPassword);
        try {
            lib.autentificator(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Задча №3
        //Вызов функции рекурсивного находения ходов для игры "Ханойские башни"
        lib.towers("1", "3", "2", 3);
    }
    
}
