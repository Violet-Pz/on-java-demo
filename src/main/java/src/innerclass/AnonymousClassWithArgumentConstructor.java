package innerclass;

public class AnonymousClassWithArgumentConstructor{
        public Wrapping wrapping(int x) {
            // 匿名内部类需要一个有参构造函数 的创建方法：
            // Base constructor call:
            return new Wrapping(x) { // [1]
                @Override
                public int value() {
                    // super.value() 父类的value()方法
                    System.out.println(super.doubleValue());    // 20
                    return super.value() * 47;
                }
            }; // [2]
        }
        public static void main(String[] args) {
            AnonymousClassWithArgumentConstructor p = new AnonymousClassWithArgumentConstructor();
            System.out.println(p.wrapping(10).value());     // 470
        }
}
