package 과제;

public class aliquot {

	public static void main(String[] args) {
		//약수구하기
		//약수 : 주어진 값을 나누어 떨어지게 하는 수
		int a =36; //주어진 값
				for(int b = 1;b<=a;b++) { //b는 1부터 시작해 36이 될때까지 반복
					if(a%b==0) { //a랑b를 나눴을때 나머지 몫이 0이 되는가
						System.out.println(b); //결과물
	}
}

	}

}
