package calculator2;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> res = new ArrayList<>();
    int num1;
    int num2;
    int result;
    char calSym;

    public Calculator() {
    }

    public ArrayList<Integer> getRes() {
        return res;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getCalSym() {
        return calSym;
    }

    //맨 앞 데이터 삭제
    public void removeResult() {
        res.remove(0);
    }

    //연산 결과 조회
    public void inquiryResults() {
        for (Integer r : res) {
            System.out.println(r);
        }
    }

    //사칙연산
    //더하기
    public int add(int num1, int num2) {
        return 0;
    }

    //빼기
    public int sub(int num1, int num2) {
        return 0;
    }

    //곱하기
    public int mul(int num1, int num2) {
        return 0;
    }

    //나누기
    public int div(int num1, int num2) {
        return 0;
    }

    //나머지
    public int mod(int num1, int num2) {
        return 0;
    }

    //원의 넓이
    public int calculateCircleArea(int radi) {
        return 0;
    }
}