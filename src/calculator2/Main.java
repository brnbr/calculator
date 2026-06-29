package calculator2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArithmaticCalculator acal = new ArithmaticCalculator();
        CircleCalculator circle = new CircleCalculator();
        Exception exc = new Exception();

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1. 사칙연산,  2. 원의 넓이 : ");
            int choice = scan.nextInt();

            //사칙연산
            if (choice == 1) {
                System.out.println("첫 번째 숫자를 입력하세요: ");
                int num1 = scan.nextInt();

                System.out.println("두 번째 숫자를 입력하세요: ");
                int num2 = scan.nextInt();

                System.out.println("사칙연산 기호를 입력하세요: ");
                char calSym = scan.next().charAt(0);

                if (calSym == '+') {
                    acal.adder(num1,num2);
                } else if (calSym == '-') {
                    acal.sub(num1, num2);
                } else if (calSym == '*') {
                    acal.mul(num1, num2);
                } else if (calSym == '/') {
                    acal.div(num1, num2);
                } else if (calSym == '%') {
                    acal.mod(num1, num2);
                }else {
                    exc.exception();
                }
            } else if (choice == 2) {
                //원의 넓이 계산
                System.out.println("반지름을 입력하세요: ");
                int radi = scan.nextInt();
                circle.calculateCircleArea(radi);
            } else {
                exc.exception();
            }

            //결과 조회
            System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inq = scan.next();
            if(inq.equals("inquiry")){
                acal.inquiryResults();
            }

            //맨 앞 데이터 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String rm = scan.next();
            if(rm.equals("remove")){
                acal.removeResult();
            }

            //종료
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scan.next();
            if (exit.equals("exit")) {
                return;
            }
        }
    }
}
