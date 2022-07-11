package Task_seminar_4;

public class INN extends Tasks {

    @Override
    public int prioritet() {
        return 2;
    }

    @Override
    public long time() {
        return 2000;
    }

    @Override
    public String description() {
        return "Выдача ИНН";
    }
    
}
