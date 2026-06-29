package calculator2;

public class ArithmaticCalculator extends Calculator{
    private final AddOperator  add = new AddOperator();
    private final SubtractOperator sub = new SubtractOperator();
    private final MultiplyOperator mul = new MultiplyOperator();
    private final DivideOperator div = new DivideOperator();

    @Override
    public int add(int num1, int num2) {
        return add.operator(num1, num2);
    }

    @Override
    public int sub(int num1, int num2) {
        return sub.operator(num1, num2);
    }

    @Override
    public int mul(int num1, int num2) {
        return mul.operator(num1, num2);
    }

    @Override
    public int div(int num1, int num2) {
        return div.operator(num1, num2);
    }
}
