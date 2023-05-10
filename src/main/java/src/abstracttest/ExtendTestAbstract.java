package abstracttest;

public class ExtendTestAbstract extends TestAbstract1{
    public void num() {
        System.out.println("ExtendTestAbstract-num");
    }

    @Override
    public String type() {
        return "ExtendTestAbstract-type";
    }
}
