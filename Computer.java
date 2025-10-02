public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Компьютер " + brand + "\n" +
                "\t" + processor + "\n" +
                "\t" + memory + "\n" +
                "\t" + monitor + "\n";
    }
}