package ����;

public class score {

	public static void main(String[] args) {
		//������ 70��
		
	int score = 70;
	//90���̻� 100�� ����,80~89��,70~79��,60~69��,�� ���ϸ�=����
	
	if(score>=90&&score<=100) {System.out.println("A");
	}//if(score>=90&&score<=100) {System.out.println("A");}
	else if(score>=80&&score<=89) {System.out.println("B");
	}//else if(score>=80&&score<=89) {System.out.println("B");}
	else if(score>=70&&score<=79) {System.out.println("C");
	}//else if(score>=70&&score<=79) {System.out.println("C");}
	else if(score>=60&&score<=69) {System.out.println("D");
	}//else if(score>=60&&score<=69) {System.out.println("D");}
	else {System.out.println("F");
	}//else {System.out.println("F");

}
}
