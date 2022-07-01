package Task_seminar_3;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class lib {
    
    // Метод для задачи №1 | Добавляет значения в Map.
    public static void addValues(Map<String, ArrayList<String>> hashMap, String key, String Value) {
        ArrayList<String> tempList = null;
        if (hashMap.containsKey(key)) {
            tempList = new ArrayList<String>();
            tempList = hashMap.get(key);
            tempList.add(Value);  
        } else {
            tempList = new ArrayList<String>();
            tempList.add(Value);               
            }
        hashMap.put(key,tempList);
    }

    // Метод для задачи №2 | Рекурсивно сравнивает введённые пользователем логин и пароль с валидными данными из файла validData.java
    public static void autentificator(int attempts) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = sc.nextLine();
        System.out.println("Введите пароль:");
        String password = sc.nextLine();
        
        if(attempts > 0){
            if(attempts == 3){
                System.out.println("Совершено несколько неверных попыток, подождите немного.");
                Thread.sleep(5000);
            }
            try {
                if(login.equals(validData.validLogin) && password.equals(validData.validPassword)){
                    System.out.println("OK");
                }else{
                    System.out.println("NOK");
                    autentificator(attempts - 1);
                }
                    sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Попытки закончились!");
            sc.close();
        }

    }

    //Метод для задачи №3 | Рекурсивное находение ходов для игры "Ханойские башни"
    public static void towers(String with , String on, String some, int count ) {
        if (count > 1){
            towers(with, some, on, count - 1);
        }
        System.out.printf("%s => %s\n", with, on);
        if (count > 1){
            towers(some, on, with, count - 1);
        }
    }

}
