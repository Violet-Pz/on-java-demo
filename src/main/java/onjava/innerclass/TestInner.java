package innerclass;

public class TestInner {
    static class Contents {

        public int value() {
            int i = 11;
            return i; }
    }

    static class Destination {
        private final String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() { return label; }
    }
    // Using inner classes looks just like
    // using any other class, within Parcel1:
    public void ship(String dest) {
        Contents c = new Contents();
        System.out.println(c.value());
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        TestInner p = new TestInner();
        p.ship("Tasmania");
        //output:
        //11
        //Tasmania
    }
}
