package 과제;

public class rounding_off {

	public static void main(String[] args) {
		//반올림(0~9사이의 숫자)
		//4이하"0" 5이상"10"
		//어떤수=난수
		
		int num = 9; 
		//int random = (int)(Math.random()*8+1); : 랜덤으로 숫자가 나옴
		//(int)는 캐스팅됨
		//double값 : 0*8+1<=Math.random()<1*8+1
		//Math.random() -> Math클래스의 random이라고 하는 메소드 
		//double값(리턴값) : 0<=Math.random()<1
		//System.out.println(random); = (random)은 정수
		//리턴값 : 메소드가 끝나고 내보내는 값
if(num>=5) {System.out.println("10");
//if(random<=4){System.out.println(0);}
//else if(random>=5){System.out.println(10);}
}else {System.out.println("0");

}
	}
}
