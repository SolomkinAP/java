public class PrintableTest {
    public static void main(String[] args) {
        Printable[] items = new Printable[4];
        items[0] = new Book("Война и мир", "Лев Толстой");
        items[1] = new Magazine("Vogue");
        items[2] = new Magazine("National Geographic");
        items[3] = new Book("Преступление и наказание", "Фёдор Достоевский");

        for (Printable item : items) {
            item.print();
        }
    }
}