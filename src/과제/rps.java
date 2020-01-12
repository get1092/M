package 과제;

import java.util.Scanner;

public class rps {

	public static void main(String[] args) {
		// 가위바위보 게임 업그레이드
		// 1. 정해진 판수만큼 실행하기 - 정해져 있기 때문에 for문이 좋음.
		// 2. 정해진 승수만큼 실행하기 - while문,언제 어떻게 이길지 모르기때문에.(끝은 있는데 얼마나 걸릴지 모름)
		// 3. 문자열로 실행하기
		//3-1. 문자열 입력
		//3-2. 
		// *한번만 실행되는게 어디인가/반복되어 실행되어야하는게 어디인가.
		// 1-가위 2-바위 3-보

		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 시작");

		// 승수 (3승)
		int victory = 0;
		int inputInt = 0; // 입력
		while (victory<3) { 
			System.out.println("숫자를 입력해 주세요");
			System.out.println("1.가위|2:바위|3:보");
			System.out.print("입력 : ");
			String inputStr = sc.nextLine();
			if(inputStr.equals("가위")) {
				inputInt = 1;
			}else if(inputStr.equals("바위")) {
				inputInt = 2;
			}else if(inputStr.equals("보")) {
				inputInt = 3;
			}
			
			
			int rps = (int) (Math.random() * 3) + 1;
			switch (rps) {
			case 1:
				System.out.println("가위");
				break;
			case 2:
				System.out.println("바위");
				break;
			case 3:
				System.out.println("보");
				break;

			}
			System.out.println("를 냈습니다.");
			System.out.println("결과 발표");

			if (inputInt == rps) {
				System.out.println("무승부");

			} else {
				if (inputInt == 1 && rps == 3) {
					System.out.println("이김");
					victory++;
				} else if (inputInt == 2 && rps == 1) {
					System.out.println("이김");
					victory++;
				} else if (rps == 3 && inputInt == 1) {
					System.out.println("이김");
					victory++;
				} else {
					System.out.println("졌음");
				}
			}

		}
	}
}