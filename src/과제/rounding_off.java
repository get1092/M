package ����;

public class rounding_off {

	public static void main(String[] args) {
		//�ݿø�(0~9������ ����)
		//4����"0" 5�̻�"10"
		//���=����
		
		int num = 9; 
		//int random = (int)(Math.random()*8+1); : �������� ���ڰ� ����
		//(int)�� ĳ���õ�
		//double�� : 0*8+1<=Math.random()<1*8+1
		//Math.random() -> MathŬ������ random�̶�� �ϴ� �޼ҵ� 
		//double��(���ϰ�) : 0<=Math.random()<1
		//System.out.println(random); = (random)�� ����
		//���ϰ� : �޼ҵ尡 ������ �������� ��
if(num>=5) {System.out.println("10");
//if(random<=4){System.out.println(0);}
//else if(random>=5){System.out.println(10);}
}else {System.out.println("0");

}
	}
}
