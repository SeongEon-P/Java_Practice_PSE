package java_project_박성언;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
	        System.out.println("컴퓨터가 숫자를 생각했습니다.");
	        int randomNumber = random.nextInt(100) + 1;

	        switch (randomNumber % 2) {
            case 0:
                System.out.println("힌트는 짝수입니다.");
                break;
            case 1:
                System.out.println("힌트는 홀수입니다.");
                break;
        }
	        System.out.println("1~100 사이의 값을 입력 >>");

	        int guess = scanner.nextInt(); //정수 입력받아서 guess에 저장한다는 뜻
	        int tryNum = 1;

	        while (guess != randomNumber) { //guess가 randomNumber랑 다른 동안에는 계속 반복한다는 뜻
	            if (guess < randomNumber) {
	                System.out.println("더 큰 수입니다.");
	            } else {
	                System.out.println("더 작은 수입니다.");
	            }
	        
	            System.out.println("1~100 사이의 값을 입력 >>");
	            guess = scanner.nextInt();
	            tryNum++; //시도할때마다 1씩 늘어남
	        }

	        System.out.println(tryNum + "회 만에 맞췄습니다.");
	        System.out.println("=== 게임을 종료합니다. ===");

	        scanner.close();
	    }
	}