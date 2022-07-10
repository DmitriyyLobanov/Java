package Task_seminar_2;



public class program {
    public static void main(String[]ars) {
        /* 
        int[] test = library.createArray(20, 100);      //Создание массива под бинарный поиск и эмуляцию
                                                                                    //динамического массива.
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));

        int findNum = 45;
        int binarySearchResult = library.binarySearch(test, findNum);
        if(binarySearchResult != -1){
            System.out.printf("Индекс искомого элемента = %d\n",binarySearchResult);          //Вывод результатов бинарного поиска
        }else{                                                                                        // в случае отсутствия элемента возврат -1
            System.out.println("Элемент не найден.");
        }

        test = library.arrayAppend(test, 11111);                            //Демонстрация работы метода эмулирующего
        System.out.println(Arrays.toString(test));                                        // работу динамического массива.
        */

        //2? + ?5 = 69
        String expressionTest = library.restoringExpression("2? + ?5 = 69");
        System.out.println(expressionTest);

        

    }
    
}
