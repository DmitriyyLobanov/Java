package Task_seminar_4;
public class InternationalPassport extends Tasks{

    @Override
    public int prioritet() {
        return 4;
    }

    @Override
    public long time() {
        return 4000;
    }

    @Override
    public String description() {
        return "Выдача загранпаспорта";
    }

}