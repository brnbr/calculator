package level2;

import java.io.IOException;
import java.util.ArrayList;

public class ArithmaticCalculator extends Calculator{
    private final AddOperator adder = new AddOperator();
    private final SubtractOperator sub = new SubtractOperator();
    private final MultiplyOperator mul = new MultiplyOperator();
    private final DivideOperator div = new DivideOperator();
    private final ModOperator mod = new ModOperator();
    Exception exc = new Exception();

    public ArithmaticCalculator(int num1, int num2, char oper) {
        super(num1, num2, oper);
    }

    @Override
    public void excuteOper() throws IOException {
        if (getOper() == '+') {
            adder(num1, num2);
        } else if (getOper() == '-') {
            sub(num1, num2);
        } else if (getOper() == '*') {
            mul(num1, num2);
        } else if (getOper() == '/') {
            div(num1, num2);
        } else if (getOper() == '%') {
            mod(num1, num2);
        }else {
            exc.exception();
        }
    }

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