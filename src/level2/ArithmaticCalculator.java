package level2;

import java.util.ArrayList;

public class ArithmaticCalculator extends Calculator{
    private final AddOperator  adder = new AddOperator();
    private final SubtractOperator sub = new SubtractOperator();
    private final MultiplyOperator mul = new MultiplyOperator();
    private final DivideOperator div = new DivideOperator();
    private final ModOperator mod = new ModOperator();

    @Override
    public ArrayList<Integer> adder(int num1, int num2) {
        res.add(adder.operator(num1, num2));
        return res;
    }

    @Override
    public ArrayList<Integer> sub(int num1, int num2) {
        res.add(sub.operator(num1, num2));
        return res;
    }

    @Override
    public ArrayList<Integer> mul(int num1, int num2) {
        res.add(mul.operator(num1, num2));
        return res;
    }

    @Override
    public ArrayList<Integer> div(int num1, int num2) {
        res.add(div.operator(num1, num2));
        return res;
    }

    @Override
    public ArrayList<Integer> mod(int num1, int num2) {
        res.add(mod.operator(num1, num2));
        return res;
    }
}