package innerclass;

public class Upcasting {
    private static class PContents implements Contents {
        @Override
        public int value() {
            return 1155; }

        @Override
        public String weather() {
            return null;
        }
    }
    protected static final class PDestination implements Destination {
        private final String label;
        private PDestination(String whereTo) {
            label = whereTo;
        }
        @Override
        public String readLabel() { return label; }
    }
    public Destination destination(String s) {
        return new PDestination(s);
    }
    public Contents contents() {
        return new PContents();
    }

}
