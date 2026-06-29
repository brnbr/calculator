package calculator2;

public class CircleCalculator extends Calculator{

    @Override
    public int calculateCircleArea(int radi){
        result = (int) (Math.pow(radi,2) * Math.PI);

        return result;
    }
}
