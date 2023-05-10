package interfacetest;

public interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();

    default void newMethod() {
        System.out.println("newMethod");
    }

    static void show (String str) {
        System.out.println("static interface method: " + str);
    }
}

