package calculator2;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    @Override
    public ArrayList<Integer> calculateCircleArea(int radi){
        result = (int) (Math.pow(radi,2) * Math.PI);
        cir.add(result);
        return cir;
    }
}
