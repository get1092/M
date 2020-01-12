package 과제;

public class score {

	public static void main(String[] args) {
		//점수가 70점
		
	int score = 70;
	//90점이상 100점 이하,80~89면,70~79면,60~69면,그 이하면=조건
	
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
