package Task_seminar_4;

public class ComplexRequest extends Tasks {

    @Override
    public int prioritet() {
        return 6;
    }

    @Override
    public long time() {
        return 6000;
    }

    @Override
    public String description() {
        return "Происходит обработка комплексного запроса";
    }
    
}
