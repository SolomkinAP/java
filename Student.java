// Student.java
public class Student extends Pupil {
    public Student(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Студент: " + name;
    }
}
