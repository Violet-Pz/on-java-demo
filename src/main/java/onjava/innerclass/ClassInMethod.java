package innerclass;

public class ClassInMethod {
    public Destination destination(String s) {

        // 作用域在 Destination destination 方法中的内部类
        final class PDestination implements Destination {
            private final String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() { return label; }
        }

        // 该方法使用内部类的方法
        return new PDestination(s);
    }

    public static void main(String[] args) {
        ClassInMethod p = new ClassInMethod();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());      // Tasmania
    }
}
