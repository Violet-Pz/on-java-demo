package innerclass;

public class AnonymousClass {
    public Contents contents() {
        // 类型为Content的匿名内部类
        // 不准确的理解？：
        // 假设"匿名"是"abc"，类的声明应该是： new Content abc() { public void method(); ...}
        // 实际是： class MyAbc implement Content() { ... }
        return new Contents() { // Insert class definition

            // 重载
            @Override
            public int value() {
                return 12; }

            public String weather() {
                return "rainy";
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        AnonymousClass p = new AnonymousClass();
        System.out.println(p.contents().value());   // 12
        System.out.println(p.contents().weather());   // rainy
    }
}
