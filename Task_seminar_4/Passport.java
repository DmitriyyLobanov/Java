package Task_seminar_4;

public class Passport extends Tasks {
    
    @Override
    public int prioritet() { //назначаем приоритет конкретной задачи
        return 1;
    }

    @Override
    public long time() { // назначаем время выполнения конкретной задачи
        return 1000;
    }

    @Override
    public String description() {
        return "Выдача паспорта";
    }

}
