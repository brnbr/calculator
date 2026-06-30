package level2;

import java.io.IOException;
import java.util.ArrayList;

public class Calculator {
    static ArrayList<Integer> res = new ArrayList<>();
    static ArrayList<Integer> cir = new ArrayList<>();
    int num1;
    int num2;
    char oper;
    int radi;

    public Calculator(int num1, int num2, char oper) {
        this.num1 = num1;
        this.num2 = num2;
        this.oper = oper;
    }

    public Calculator(int num1) {
        this.num1 = num1;
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

    public int getRadi() {
        return radi;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    public char getOper() {
        return oper;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }

    //연산자에 따라 호출할 메서드 구분
    public void excuteOper() throws IOException { }

    //맨 앞 데이터 삭제
    public void removeResult() {
        res.remove(0);
    }

    //연산 결과 조회
    public void inquiryResults() {
        System.out.println(this);
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