package Task_seminar_4;

public class Payment extends Tasks {

    @Override
    public int prioritet() {
        return 5;
    }

    @Override
    public long time() {
        return 5000;
    }

    @Override
    public String description() {
        return "Оформление выплаты";
    }
    
}
