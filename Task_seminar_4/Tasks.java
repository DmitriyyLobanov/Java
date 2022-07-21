package Task_seminar_4;



public abstract class Tasks {

    public String number(int previos){  // метод не абстрактный, наследуется напрямую 
        int nextNum = previos + 1; 
        return Integer.toString(nextNum);  // возврат сгенерированного значения
}

    public abstract int prioritet(); // метод абстрактный, требует реализации в классе наследнике

    public abstract long time(); // метод абстрактный, требует реализации в классе наследнике

    public abstract String description(); // метод абстрактный, требует реализации в классе наследнике
}


