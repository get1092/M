package ����;

import java.util.Scanner;

public class rps {

	public static void main(String[] args) {
		// ���������� ���� ���׷��̵�
		// 1. ������ �Ǽ���ŭ �����ϱ� - ������ �ֱ� ������ for���� ����.
		// 2. ������ �¼���ŭ �����ϱ� - while��,���� ��� �̱��� �𸣱⶧����.(���� �ִµ� �󸶳� �ɸ��� ��)
		// 3. ���ڿ��� �����ϱ�
		//3-1. ���ڿ� �Է�
		//3-2. 
		// *�ѹ��� ����Ǵ°� ����ΰ�/�ݺ��Ǿ� ����Ǿ���ϴ°� ����ΰ�.
		// 1-���� 2-���� 3-��

		Scanner sc = new Scanner(System.in);

		System.out.println("���������� ����");

		// �¼� (3��)
		int victory = 0;
		int inputInt = 0; // �Է�
		while (victory<3) { 
			System.out.println("���ڸ� �Է��� �ּ���");
			System.out.println("1.����|2:����|3:��");
			System.out.print("�Է� : ");
			String inputStr = sc.nextLine();
			if(inputStr.equals("����")) {
				inputInt = 1;
			}else if(inputStr.equals("����")) {
				inputInt = 2;
			}else if(inputStr.equals("��")) {
				inputInt = 3;
			}
			
			
			int rps = (int) (Math.random() * 3) + 1;
			switch (rps) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("����");
				break;
			case 3:
				System.out.println("��");
				break;

			}
			System.out.println("�� �½��ϴ�.");
			System.out.println("��� ��ǥ");

			if (inputInt == rps) {
				System.out.println("���º�");

			} else {
				if (inputInt == 1 && rps == 3) {
					System.out.println("�̱�");
					victory++;
				} else if (inputInt == 2 && rps == 1) {
					System.out.println("�̱�");
					victory++;
				} else if (rps == 3 && inputInt == 1) {
					System.out.println("�̱�");
					victory++;
				} else {
					System.out.println("����");
				}
			}

		}
	}
}