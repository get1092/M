package ����;

public class prime_number_test {

	public static void main(String[] args) {

int result=0; //result�̸�����+�Ҽ��� ����� ��
		for(int a=2;a<=30;a++) {

			boolean primenumber = true;
			for(int b = 2;b<=a-1;b++) {
				if(a%b==0) {
					primenumber = false;
				}
			}

			if(primenumber == true) {
				result++;//�Ҽ��� ����+"++"=��������
		}
	}System.out.println(result+"��");
}
}