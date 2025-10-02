// Monitor.java
public class Monitor {
    private double size;

    public Monitor(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Монитор: " + size + " дюймов";
    }
}

