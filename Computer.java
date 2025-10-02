// Computer.java
public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Компьютер " + brand +
                "\n" + processor +
                "\n" + memory +
                "\n" + monitor;
    }
}
