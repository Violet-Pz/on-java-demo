package innerclass;

public class TestUpcasting {
    public static void main(String[] args) {
        Upcasting p = new Upcasting();
        Contents c = p.contents();
        System.out.println(c.value());      // 1155
        System.out.println();

        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());      // Tasmania
        // Illegal -- can't access private class:
        //- Upcasting.PContents pc = p.new PContents();
    }
}
