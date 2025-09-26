public class TestMovable {
    public static void main(String[] args) {
        // MovablePoint
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Point start: " + p);
        p.moveRight();
        p.moveUp();
        System.out.println("Point after moveRight & moveUp: " + p);

        // MovableCircle
        MovableCircle mc = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Circle start: " + mc);
        mc.moveLeft();
        mc.moveDown();
        System.out.println("Circle after moveLeft & moveDown: " + mc);

        // MovableRectangle
        MovableRectangle mr = new MovableRectangle(0, 10, 5, 0, 2, 2);
        System.out.println("Rectangle start: " + mr);
        System.out.println("Speeds equal? " + mr.speedsAreEqual());
        mr.moveRight();
        mr.moveDown();
        System.out.println("Rectangle after moveRight & moveDown: " + mr);
    }
}
// Интерфейс Movable содержит четыре метода движения.
// MovablePoint — базовая реализация (поле скорости и координаты).
// MovableCircle делегирует движения MovablePoint (центр круга движется).
// MovableRectangle содержит две точки — проверка speedsAreEqual() необходима, чтобы гарантировать корректное движение (по ТЗ: две точки должны иметь одинаковую скорость).
// Все moveX методы изменяют координаты точек в соответствии со скоростями.