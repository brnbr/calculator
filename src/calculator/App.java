package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    //lever1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> calres = new ArrayList<>();
        int result = 0;
        int cnt = 0;

        String exit = "";  //종료
        String remv = "";  //맨 앞 결과 삭제
        String inq = "";   //결과 조회

        //계산
        while (true) {
            //숫자 입력 받기
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = scan.nextInt();

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = scan.nextInt();

            //사칙연산 기호 입력받기
            System.out.println("사칙연산 기호를 입력하세요: ");
            char calSym = scan.next().charAt(0);

            //계산
            if (calSym == '+') {
                result = num1 + num2;
            } else if (calSym == '-') {
                result = num1 - num2;
            } else if (calSym == '*') {
                result = num1 * num2;
            } else if (calSym == '/') {
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }

                result = num1 / num2;
            } else {
                throw  new ArithmeticException("연사자를 다시 입력하십시오");
            }

            System.out.println(result);
            calres.add(result);
            cnt++;

            //10개 넘으면 맨 앞 삭제
//            if (cnt > 9) {
//                calres.remove(0);
//            }

            //remove 입력 시 맨 앞 결과 삭제
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            remv = scan.next();
            if (remv.equals("remove")) {
                calres.remove(0);
            }

            //inquiry 입력 시 저장된 결과 출력
            System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            inq = scan.next();
            if (inq.equals("inquiry")) {
                for (int i = 0; i < calres.size(); i++) {
                    System.out.print(calres);
                }
            }

            //종료 시 전체 결과 출력
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = scan.next();
            if (exit.equals("exit")) {
                System.out.print("전체 계산 결과: ");

                for (int i = 0; i < calres.size(); i++) {
                    System.out.print(calres);
                }

                return;
            }
        }
    }
}
