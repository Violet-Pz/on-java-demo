package j;

public class Stone {
    protected int num = 6;
    public int pubNum = 0;
    private void PrintPrivate() {
        System.out.println("private");
    }
    protected void PrintProtected() {
        System.out.println("protected");
    }
    public void PrintPublic() {
        PrintPrivate();
        PrintProtected();
        System.out.println("public");
    }
}

//{
//        j.Stone(int num) {
//        System.out.println(num + " stones");
//        }
//        j.Stone() {
//        System.out.println("SixTONES´");
//        }
//        }
