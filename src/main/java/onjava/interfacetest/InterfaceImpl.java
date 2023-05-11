package interfacetest;

public class InterfaceImpl implements InterfaceWithDefault {
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    public static void main(String[] args) {
        InterfaceWithDefault i = new InterfaceImpl();
        i.firstMethod();
        i.secondMethod();

        i.newMethod();
        // 没有在实现类中实现接口类中的newMethod
        // newMethod在接口类中通过default被实现

        // 调用方法： interface_name.static_method_name();
        InterfaceWithDefault.show("ha");    // static interface method: ha
    }
}
