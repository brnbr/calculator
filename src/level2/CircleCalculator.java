package level2;

import java.util.ArrayList;

public class CircleCalculator extends Calculator{

    public CircleCalculator(int radi) {
        super(radi);
    }

    @Override
    public ArrayList<Integer> calculateCircleArea(int radi){
        cir.add((int) (Math.pow(radi,2) * Math.PI));
        return cir;
    }
}