package abstracttest;

public class TestAbstract1  extends BasicAbstract{

    @Override
    public void num() {
        System.out.println("test abstract 1");
    }

    @Override
    public String type() {
        return "TestAbstract1";
    }
}
