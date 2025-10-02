// Memory.java
public class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ОЗУ: " + size + " GB";
    }
}
