package innerclass;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public class Calculate {
        public void add() {
            System.out.println(num1 += num2);
        }

        public void sub() {
            System.out.println(num1 -= num2);
        }
    }

    public Calculate calculate() {
        return new Calculate();
    }
    public void mul() {
        num1 *= num2;
    }

    public void div() {
        if (num2 == 0) {
            System.out.println("Invalid input");
            return;
        }
        num1 /= num2;
    }
}
