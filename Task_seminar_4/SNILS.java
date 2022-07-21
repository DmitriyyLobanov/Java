package Task_seminar_4;

public class SNILS extends Tasks {

    @Override
    public int prioritet() {
        return 3;
    }

    @Override
    public long time() {
        return 3000;
    }

    @Override
    public String description() {
        return "Выдача СНИЛС";
    }
    
}
