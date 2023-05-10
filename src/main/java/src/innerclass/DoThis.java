package innerclass;

public class DoThis {
    void f() {
        System.out.println("do this f()");
    }
    public class Inner {
        public DoThis outer() {
            return DoThis.this;     // return this; 是 outer
        }
    }
    public Inner inner() {
        return new Inner();
    }
    public static void main(String[] args) {
        DoThis doThis = new DoThis();
        // DoThis.Inner-> public Inner inner()

        // ?
        DoThis.Inner test = doThis.inner();
//        DoThis.Inner test2 = new DoThis.Inner();
        test.outer().f();
//        test2.outer().f();
    }
}
