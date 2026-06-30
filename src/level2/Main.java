package level2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        CircleCalculator circle = null;
        ArithmaticCalculator acal = null;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("1. 사칙연산,  2. 원의 넓이 : ");
            int choice = scan.nextInt();

            //사칙연산
            if (choice == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = scan.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = scan.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: ");
                char oper = scan.next().charAt(0);

                acal = new ArithmaticCalculator(num1, num2, oper);
                acal.excuteOper();

            } else if (choice == 2) {
                //원의 넓이 계산
                System.out.println("반지름을 입력하세요: ");
                int radi = scan.nextInt();

                circle = new CircleCalculator(radi);
                circle.calculateCircleArea(radi);
            }

            //결과 조회
            System.out.print("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회): ");
            String inq = scan.next();
            if(inq.equals("inquiry")){
                acal.inquiryResults();
            }

            //맨 앞 데이터 삭제
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String rm = scan.next();
            if(rm.equals("remove")){
                acal.removeResult();
            }

            //종료
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = scan.next();
            if (exit.equals("exit")) {
                return;
            }
        }
    }
}
