// Processor.java
public class Processor {
    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", " + frequency + "GHz";
    }
}
