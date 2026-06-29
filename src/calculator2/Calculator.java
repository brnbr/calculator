package calculator2;

import java.util.ArrayList;

public class Calculator {
    static ArrayList<Integer> res = new ArrayList<>();
    static ArrayList<Integer> cir = new ArrayList<>();
    int num1;
    int num2;
    int result;
    char calSym;

    public Calculator() {
    }

    public ArrayList<Integer> getRes() {
        return res;
    }

    public static ArrayList<Integer> getCir() {
        return cir;
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
        if (!res.isEmpty()) {
            System.out.println("사칙연산: " + res);
        }

        if (!cir.isEmpty()) {
            System.out.println("원 넓이: " + cir);
        }
    }

    //계산
    //더하기
    public ArrayList<Integer> adder(int num1, int num2) {
        return res;
    }

    //빼기
    public ArrayList<Integer> sub(int num1, int num2) {
        return res;
    }

    //곱하기
    public ArrayList<Integer> mul(int num1, int num2) {
        return res;
    }

    //나누기
    public ArrayList<Integer> div(int num1, int num2) {
        return res;
    }

    //나머지
    public ArrayList<Integer> mod(int num1, int num2) {
        return res;
    }

    //원의 넓이
    public ArrayList<Integer> calculateCircleArea(int radi) {
        return cir;
    }

    @Override
    public String toString() {
        return "사칙연산: " + res + "\n" + "원 넓이: " + cir;
    }
}