package innerclass;

public class TestOuter {
    private final Object[] items;
    private int next = 0;
    public TestOuter(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        TestOuter testOuter = new TestOuter(10);
        for(int i = 0; i < 10; i++)
            testOuter.add(Integer.toString(i));
        Selector selector = testOuter.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
    // output: 0 1 2 3 4 5 6 7 8 9
}
