package 과제;

public class prime_number_test {

	public static void main(String[] args) {

int result=0; //result이름지정+소수가 몇개인지 모름
		for(int a=2;a<=30;a++) {

			boolean primenumber = true;
			for(int b = 2;b<=a-1;b++) {
				if(a%b==0) {
					primenumber = false;
				}
			}

			if(primenumber == true) {
				result++;//소수의 갯수+"++"=갯수적립
		}
	}System.out.println(result+"개");
}
}